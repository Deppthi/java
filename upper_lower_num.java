import java.util.*;
class upper_lower_num{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
String c=" ";
int c1=0,c2=0,c3=0;
System.out.print("Enter * to exit....");
while(c.charAt(0)!='*'){
System.out.print("Enter any character:");
c=a.next();
if(Character.isUpperCase(c.charAt(0))){
c1++;
}
else if(Character.isLowerCase(c.charAt(0))){
c2++;/train.csv
}
else if(Character.isDigit(c.charAt(0))){		
c3++;
}
}
System.out.println("Total number of Upper case="+c1);
System.out.println("Total number of Lower case="+c2);
System.out.println("Total number of Digits="+c3);
}
}