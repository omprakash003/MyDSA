package Arrays;
import java.util.ArrayList;

public class SortZeroneAndTwo {
    public static void main(String[] args) {
        int[]arr={1,2,2,0,0};
        ArrayList<Integer>list=new ArrayList<>();
        for(int e:arr){
            list.add(e);
        }
        System.out.println(list);
        sort012(list);
        System.out.println(list);
    }
    public static void sort012(ArrayList<Integer> arr) {
        // code here
        int i=0,k=0,j=arr.size()-1;
        while(i<=j){
            if(arr.get(i)==0){
                int temp=arr.get(i);
                arr.set(i,arr.get(k));
                arr.set(k,temp);
                i++;
                k++;

            }
            else if(arr.get(i)==2){
                int temp=arr.get(i);

                arr.set(i,arr.get(j));
                arr.set(j,temp);

                j--;

            }
            else{
                i++;
            }
        }
    }
}
