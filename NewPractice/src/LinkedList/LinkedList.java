package LinkedList;
class ListNode{
    int val;
    ListNode next;
    ListNode(int data){
        this.val=data;
        this.next=null;


    }
    ListNode(int val, ListNode next) {
        this.val = val; this.next = next;
    }

    public ListNode() {

    }
}

public class LinkedList {
    public static void main(String[] args) {
        int[]arr={9,9,1};
        int[]arr2={1};

        ListNode node=new ListNode(arr[0]);
        ListNode node2=new ListNode(arr2[0]);

        ListNode temp=node;
        ListNode temp2=node2;

        for(int i=1;i< arr.length;i++){
            temp.next= new ListNode(arr[i]);
           temp=temp.next;
        }
        for(int i=1;i< arr2.length;i++){
            temp2.next= new ListNode(arr2[i]);
            temp2=temp2.next;
        }
        addNumbers(node ,node2);


    }
    public static  void addNumbers(ListNode l1,ListNode l2){
        ListNode head1=l1;
        ListNode head2=l2;
        ListNode ans=new ListNode();
        ListNode temp=ans;
        int carry=0;
        int sum=0;
        while(head1!=null && head2!=null){
            int tempcarry=0;
            sum=head1.val+head2.val+carry;
            if(sum>9){
                tempcarry=sum/10;
                sum=sum%10;

            }
            else{
                tempcarry=0;
            }


            temp.next=new ListNode(sum);
            carry=tempcarry;
            temp=temp.next;
            head1=head1.next;
            head2=head2.next;

        }


        while(head1!=null){
            sum=head1.val+carry;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;

            }
            else{
                carry=0;
            }

            temp.next=new ListNode(sum);
            temp=temp.next;
            head1=head1.next;

        }
        while(head2!=null){
            sum=head2.val+carry;
            if(sum>9){
                carry=sum/10;
                sum=sum%10;

            }
            else{
                carry=0;
            }
            temp.next=new ListNode(sum);
            temp=temp.next;
            head2=head2.next;

        }

        if(carry>0){
            temp.next=new ListNode(carry);
        }
        ListNode head=ans;
        while(head!=null){
            System.out.print(head.val+"-->");
            head=head.next;
        }

    }
    public static ListNode Add2Numbers_LeetcodeSol(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = (l1 != null) ? l1.val : 0;
            int digit2 = (l2 != null) ? l2.val : 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;
        return result;
    }


}
