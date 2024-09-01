import java.util.Scanner;
public class mult
{
public static void main(String[] args) {
int i,j;
try{
Scanner s=new Scanner(System.in);
System.out.println("To print the multiplication table of m upto n");
System.out.print("Enter the values of m :");
int m=s.nextInt();
System.out.print("Enter the values of n :");
int n=s.nextInt();
for(i=1;i<=n;i++)
{
System.out.println(m+"x"+i+"="+(m*i));
}
if(n<0)
{
System.out.println("Invalid");
}
}
catch(Exception e)
{
System.out.println("Invalid");
}
}
}