import java.util.Stack;

public class ParanthesisStack {
    public static void main(String[] args) {
        Stack<Character> st = new Stack<Character>();

        String t = "(()";

        char x;

        for(int i=0; i<t.length(); i++) {
            x = t.charAt(i);
            if(open(x)) st.push(x);
            else {
                if(st.isEmpty() || !chk(x, st.peek())) {
                    System.out.println("Not balanced");
                    return;
                }
                st.pop();
            }
        }

        if(!st.isEmpty()) {
            System.out.println("Not balanced");
            return;
        }

        System.out.println("Balanced");
    }

    static boolean open(char x) {
        return x == '[' || x == '{' || x == '(';
    }

    static boolean chk(char y, char x) {
        return (x == '[' && y == ']') || (x == '{' && y == '}') || (x == '(' && y == ')');
    }
}
