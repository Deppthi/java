import java.util.Scanner;
public class sharpA {

	public static void main(String[] args) {
		int i, j, k = 0; 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
                int n=sc.nextInt();
        for (i = 1; i <= n; i++)  
        { 
           
            for (j = i; j < n+2; j++)  
                System.out.print(" "); 
            while (k != (2 * i - 1)) { 
                if (k == 0 || k == 2 * i - 2) 
                    System.out.print("*"); 
                elseif(i==n/2);
                    for (i = 0; i < n ; i++)  {
                        System.out.print(" *"); 
                    }
                
                else
                    System.out.print(" "); 
                k++; 
                ; 
            } 
            
            k = 0; 
            System.out.println();  
        } 
      
       
        
    } 
}