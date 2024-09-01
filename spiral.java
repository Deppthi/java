import java.util.*;
public class spiral  
{              
public static void main(String[] args)   
{  
int i, j, k = 1;  
Scanner sc=new Scanner(System.in);
System.out.print("enter a number:");
int n=sc.nextInt();

for (i = 1; i <= n; i++)   
{  

for (j = 1; j<=n; j++)   
{  
 
System.out.print(k++   + " ");  
}  

System.out.println();  
}  
}  
}  