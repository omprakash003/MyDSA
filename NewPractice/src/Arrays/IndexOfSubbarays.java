package Arrays;
import java.util.ArrayList;
import java.util.List;

public class IndexOfSubbarays {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(ReturnIndexes(arr, 15));

    }

    public static List<Integer> ReturnIndexes(int[] arr, int x) {
        int n = arr.length;
        List<Integer> list = new ArrayList<>();

        if (n == 0 || n == 1) {
            if (n == 0) {
                list.add(-1);
                return list;
            }
            if (n == 1) {
                if (arr[0] == x) {
                    list.add(1);
                    list.add(1);
                    return list;
                } else {
                    list.add(-1);
                    return list;
                }
            }
        }
        if (x == 0) {
            for (int i = 0; i < n; i++) {
                if (arr[i] == 0) {
                    list.add(i + 1);
                    list.add(i + 1);
                    return list;
                }
            }
            list.add(-1);
            return list;
        }
        int i = 0, j = 0, sum = arr[0];
        while (j < n) {
            while (i < j && sum > x) {
                sum -= arr[i];
                i++;
            }

            if (sum == x) {
                list.add(i + 1);
                list.add(j + 1);
                return list;
            }
            j++;
            if(j<n){
                sum += arr[j];
            }
        }

        list.add(-1);
        return list;
}

}
