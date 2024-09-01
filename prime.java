import java.util.Scanner;
public class prime
{
	public static void main(String args[])
	{
       
		Scanner sc = new Scanner(System.in);    
		//System.out.print("Enter a  number : ");
        int n=sc.nextInt();
        if(isprime(n))
        {
        System.out.println("prime");
        }
        else{
        System.out.println("no");
        }
    }
    public static boolean isprime(int n)
    {
        //int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}