import java.util.*;  
public class Apattern
{  
public static void main(String[] args)  
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number of rows: ");  
int n = sc.nextInt();      
for(int i=0;i<n;i++){
    for(int j=0;j<=n/2;j++){
        if((j==0||j==n/2) && i!=0||i==0 && j!=n/2 || i==n/2)
            System.out.print("* ");
            else
            System.out.print("  ");
    }
    
  System.out.println();
    
}
}
}