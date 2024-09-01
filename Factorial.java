import java.util.Scanner;
public class Factorial
{
public static void main(String[] args)
{
int i,j,pr=1;
try{
Scanner s=new Scanner(System.in);
System.out.print("Enter the number:");
int n=s.nextInt();
if(n<0)
{
System.out.println("Invalid");
}
else if(n==0)
{
System.out.println("1");
}
else
{
for(i=n;i>0;i--)
{
pr=pr*i;
}
System.out.println("The factorial :"+pr);
}
}
catch(Exception e)
{
System.out.println("Invalid");
}
}
}