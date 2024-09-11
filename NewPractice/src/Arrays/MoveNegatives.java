package Arrays;

public class MoveNegatives {
    public static void main(String[] args) {
        int[] arr = {1, -1, 3, 2, -7, -5, 11, 6};
        segregateElements(arr);
    }

    public static void segregateElements(int[] arr) {
        // Your code goes here
        int[] neg = new int[arr.length];
        int i = 0, k = 0, m = 0;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                int temp = arr[k];
                arr[k] = arr[i];
                arr[i] = temp;
                k++;

            } else {
                neg[m] = arr[i];
                m++;
            }
        }
        m = 0;

        for (int j = k; j < arr.length; j++) {
            arr[j] = neg[m];
            m++;
        }
    }
}

