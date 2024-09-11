package BinarySearch;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[]arr={1};
        int[]arr2={2,3,4};
        System.out.println(findMedianSortedArrays(arr,arr2));

    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length==0){
            int x=nums2.length;
            if((nums2.length)%2==0){

                return((double)nums2[x/2]+(double) +nums2[(x/2)-1])/(double)2;
            }
            else{
                return nums2[x/2];
            }
        }
        if(nums2.length==0){
            int x=nums1.length;
            if((nums1.length)%2==0){

                return((double)nums1[x/2]+(double) +nums1[(x/2)-1])/(double)2;
            }
            else{
                return nums1[x/2];
            }
        }
        int n= nums1.length+ nums2.length;
        int m=0,l=0;
        if(n%2==0){
            m=n/2;
            l=m-1;
        }
        else{
            m=n/2;
        }
        int j=0,i=0,k=0;
        int[]arr=new int[m+1];
        while(i<nums1.length &&j<nums2.length && k<arr.length){
            if(nums1[i]<nums2[j]){
                arr[k]=nums1[i];
                i++;
            }
            else{
                arr[k]=nums2[j];
                j++;

            }
            k++;
        }
        while(k<arr.length && i<nums1.length){
            arr[k]=nums1[i];
            i++;
            k++;
        }
        while(k<arr.length && j<nums2.length){
            arr[k]=nums2[j];
            j++;
            k++;
        }

        if(n%2==0){
            return ((double) arr[m]+(double) arr[m-1])/(double) 2;

        }
        else{
            return (double)arr[m]/2;
        }

    }
}
