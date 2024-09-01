import java.util.*;
public class common {

    public static int commonnum(int[] a, int[] b, int m, int n) {
        int count = 0;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(a[i] == b[j]) {
                    count++;
                    break; 
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] a = {11, 10, 14, 1, 5};
        int[] b = {11, 1, 3, 5};
        int m = a.length;
        int n = b.length;

        int count = commonnum(a, b, m, n);
        System.out.println( count);
    }
}
