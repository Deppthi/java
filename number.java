import java.util.Scanner;
class number
 {
 public static void main(String[] args) 
{
 Scanner input = new Scanner(System.in);

  int[] arr= {14, 16, 87, 36, 25, 89, 34};
 
 Arrays.sort(arr);
 System.out.print("enter the Mth max number:- ");
 int m = input.nextInt();
 System.out.print("enter the Nth min number:- ");
 int n = input.nextInt();
 int max=0,min=0;
 
 max = arr[arr.length-m];
 min = arr[n-1];
 System.out.println("max  "+max);
 System.out.println("min  "+min);
 System.out.println(" sum : "+(max+min));
 System.out.println(" differance : "+(max-min));
 
 
}
}
