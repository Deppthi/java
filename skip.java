import java.util.Scanner;
public class skip
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.print("M=");
 int m=s.nextInt();
System.out.print("N=");
int n=s.nextInt();
System.out.print("K=");
int K=s.nextInt();

for(int i=m;i<=n;i++)
{
System.out.print(i+" ");
i=i+K;
}

}
}