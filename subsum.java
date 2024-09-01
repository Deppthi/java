import java.util.*;

public class subsum {

    public static boolean isSub(int[] arr1, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) { 
                if (arr1[i] + arr1[j] == m) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, -1, 3, 1};
        int n = arr1.length;
        int m = 2;

        if (isSub(arr1, n, m)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}