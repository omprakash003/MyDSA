package Phase2.POTD;
/* Given an array arr[][] such that arr[i][0] is the starting time of ith meeting and arr[i][1] is the ending time of ith meeting, the task is to check if it is possible for a person to attend all the meetings such that he can attend only one meeting at a particular time.

Note: A person can attend a meeting if its starting time is greater than or equal to the previous meeting's ending time.*/

import java.util.Arrays;

public class MeetingsRoom_11NOV {
    public static void main(String[] args) {
        int arr[][] = {{2,4}, {9, 12}, {6, 10}};

        Boolean answer =Checkpossible(arr);
        System.out.println(answer);

    }
    public  static boolean Checkpossible(int[][]arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));


        for (int i = 1; i <arr.length ; i++) {
            if(arr[i][0]<arr[i-1][1]){
                return false;
            }
        }

        return true;
    }

    }


