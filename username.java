import java.util.Scanner;
public class username{
    public static void main(String args[])
    {
        String s1,s2;
        boolean result;
        Scanner s= new Scanner(System.in);
		System.out.print("Enter User name :");
        s1=s.nextLine();
		System.out.print("Re-Enter User name :");
        s2=s.nextLine();
        result=s1.equals(s2);
        if (result==false)
        {
            System.out.println("User name is Invalid");
        }
        else
        {
            System.out.println("User name is valid");
        }
    }
}
