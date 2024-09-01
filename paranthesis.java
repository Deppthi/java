import java.util.*;

public class paranthesis {

    static boolean para(String s) {
        Stack<Character> st = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);

            if (x == '(' || x == '[' || x == '{') {
                st.push(x);
                continue;
            }

            if (st.isEmpty())
                return false;

            char check;
            switch (x) {
                case ')':
                    check = st.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;

                case '}':
                    check = st.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;

                case ']':
                    check = st.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        String s = "([{}])";
        if (para(s))
            System.out.println("Balanced");
        else
            System.out.println("Not Balanced");
    }
}
