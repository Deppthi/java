import java.util.Scanner;
public class subarraysum
{
	static void subarraysum(int arr[], int n, int sum)
{
 for(int i=0;i<n;i++){
    int currentsum = arr[i];
    if(currentsum==sum){
        System.out.println("sum found at"+i);
        return;
    }
    else{
        for(int j=i+1;j<n;j++){
            currentsum+=arr[j];
            if(currentsum==sum){
                System.out.println("sum found between "+i+" and "+j);
                return;
            }
        }
    }
 }
 System.out.println("sum not found");
 return;
}
public static void main(String[] args) 
{
    int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
    int n = arr.length;
    int sum = 23;
    subarraysum(arr, n, sum);
}
}