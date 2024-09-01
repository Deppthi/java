import java.util.Scanner;
public class composite
{
public static void main(String[] args) {
int i,j;
Scanner s=new Scanner(System.in);
System.out.print("Enter the values of A :");
int A=s.nextInt();
System.out.print("Enter the values of B :");
int B=s.nextInt();
System.out.println("Printing compisite numbers between A and B!");
for(i=(A+1);i<B;i++)
{
int k=0;
for(j=2;j<i;j++)
{
if(i%2==0)
{
k=k+1;
}
}
if(k!=0)
{
System.out.print(i+",");
}
}
}
}