package Phase2.LeetCode_Daily;

import javax.naming.PartialResultException;
import java.lang.management.PlatformLoggingMXBean;

public class CountUngarded {
    public static void main(String[] args) {
        int[][]arr={{1,1}};
        int[][]walls={ {0,1},{1,0},{2,1},{1,2}};
        System.out.println(Count(3,3,arr,walls));




    }
    public static int Count(int m,int n,int[][]guards,int [][]walls){
        int[][] board = new int[m][n];

        // Mark guards (1) and walls (2) on the board
        markObjects(board, guards, 1);
        markObjects(board, walls, 2);

        // Directions: up, down, left, right
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // Mark cells as guarded
        for (int[] guard : guards) {
            int row = guard[0];
            int col = guard[1];
            for (int[] dir : directions) {
                int r = row + dir[0];
                int c = col + dir[1];
                while (isInBounds(r, c, m, n) && board[r][c] != 1 && board[r][c] != 2) {
                    if (board[r][c] == 0) {
                        board[r][c] = -1; // Mark as guarded
                    }
                    r += dir[0];
                    c += dir[1];
                }
            }
        }

        // Count unguarded cells
        int unguardedCount = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 0) {
                    unguardedCount++;
                }
            }
        }

        return unguardedCount;
    }

    private  static void markObjects(int[][] board, int[][] objects, int marker) {
        for (int[] obj : objects) {
            board[obj[0]][obj[1]] = marker;
        }
    }

    private  static boolean isInBounds(int r, int c, int m, int n) {
        return r >= 0 && r < m && c >= 0 && c < n;
    }
}
