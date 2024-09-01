import java.io.*;
import java.util.Scanner;

public class pattern
{  
public static void main(String args[])   
{   
int i, j,number, n;   
Scanner sc = new Scanner(System.in);    


System.out.print("enter row:");
n=sc.nextInt();
for (i = 1; i <= n; i++)   
{  
    number=0;
for (j = 1; j <=i; j++)  
{  
    number++;
System.out.print(number+" ");  

}  
System.out.println();  
}           
}   
}  
