import java.util.Stack;
public class stack{
    public static void main(String[] args)
    {
        Stack<String>name=new Stack<>();
        name.push("sai");
        name.push("priyanka");
        name.push("Rayapudi");
        System.out.println("Stack"+name);
        String element=name.pop();
        System.out.println("Stack after pop: "+name);
        System.out.println("pop element:"+element);
        String Element=name.peek();
        System.out.println("Stack after peek:"+name);
        System.out.println("peek element:"+Element);
        boolean result=name.empty();
        System.out.println("Is the stack empty?"+ result);
        int position=name.search("sai");
        System.out.println("search element:"+position);
    }
}