package Phase2.GFG_POTD;

public class SmallestMinNumberMissing {
    public static void main(String[] args) {
        int[]arr={2, -3, 4, 1, 1, 7};
        System.out.println(Optimal(arr));

    }
    public static int MinMissing(int[]arr){
        //Notworking
        int Min_missing=0;
        int MaxMissing=0;
        int i=0;
        int j=1;
        while(j<arr.length){
            if(Min_missing==arr[i]||Min_missing==arr[j]){
                Min_missing=0;
            }
            if(MaxMissing==arr[i]||MaxMissing==arr[j]){
                MaxMissing=0;
            }
            if(arr[i]<arr[j]){
                Min_missing=arr[i]+1;
                MaxMissing=arr[j]-1;
            }
            else{
                Min_missing=arr[j]+1;
                MaxMissing=arr[i]-1;
            }
            i++;
            j++;
        }
        if(Min_missing>0){
            return Min_missing;
        }
        return MaxMissing;
    }
    public static int Optimal(int[]arr){
        int n = arr.length;

        // Place each element at its correct index
        for (int i = 0; i < n; i++) {
            while (arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i] - 1]) {
                int temp = arr[i];
                arr[i] = arr[temp - 1];
                arr[temp - 1] = temp;
            }
        }

        // Find the first missing positive integer
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                return i + 1;
            }
        }

        return n + 1;
    }
}
