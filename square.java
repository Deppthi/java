import java.util.*;  
public class square  
{  
public static void main(String[] args)  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of rows: ");  
int n = sc.nextInt();      
for (int i = 1; i <= n+n/2; i++) 
{ ṇ
    for (int j = 1; j <= n; j++) 
    { 
        if (i == 1 || i == n ||  j == 1 || j == n)     {    
            System.out.print("*");   
            }         
        else{
           System.out.print(" ");
        }
    } 
    System.out.println();
} 
}
}