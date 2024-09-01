public class missingnumber {
    public static int missing(int n, int[] arr)
    {
        int sum = 0;

        for (int i = 0; i < n - 1; i++) {
            sum += arr[i];
        }

        int totalSum = (n * (n + 1)) / 2; 

        return totalSum - sum;
    }

    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 5,6,7,8,9,10 };
        int n = 10;
        System.out.println(missing(n, arr));
    }
}