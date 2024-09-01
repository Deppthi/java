import java.util.*;
public class subarray {

    public static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {
      
        for (int i = 0; i < n; i++) {
            boolean found = false;
           
            for (int j = 0; j < m; j++) {
                if (arr2[i] == arr1[j]) {
                    found = true;
                    break;
                }
            }
           
            if (j==m)
            return false;
        }
       
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {11, 10,14,1,5};
        int[] arr2 = {11,1,3,5};
        int m = arr1.length;
        int n = arr2.length;

        if (isSubset(arr1, arr2, m, n)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}