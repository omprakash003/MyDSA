package Phase2.Mergesort;

import java.util.Arrays;

public class Implentation {
    public static void main(String[] args) {
        int[]arr={6,2,3,4,5};
        Mergesort(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }
    public static void Mergesort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int mid = start + (end - start) / 2;
        Mergesort(arr, start, mid);
        Mergesort(arr, mid + 1, end);
        Merge(arr, start, mid, end);
    }


    private static void Merge(int[] arr, int start, int mid, int end) {
        int[] k = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int m = 0;

        // Merging the two halves
        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                k[m] = arr[i];
                i++;
            } else {
                k[m] = arr[j];
                j++;
            }
            m++;
        }

        // Copy remaining elements of the first half, if any
        while (i <= mid) {
            k[m] = arr[i];
            i++;
            m++;
        }

        // Copy remaining elements of the second half, if any
        while (j <= end) {
            k[m] = arr[j];
            j++;
            m++;
        }

        // Copy back the merged elements into the original array
        for (int l = 0; l < k.length; l++) {
            arr[start + l] = k[l];
        }


    }
    }

