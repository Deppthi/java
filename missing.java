import java.util.Arrays;

public class missing {
    public static int missingNumber(int n, int[] arr)
    {
        for (int i = 1; i < n ; i++) 
        {
            if(arr[i]==i)
            {
                System.out.println("missing number is"+arr[i-1]);
            }
        }
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5 };
        int n = 5;
        System.out.println(missingNumber(n, arr));
    }
}