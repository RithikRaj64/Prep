import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String in = "a+b*(c^d-e)^(f+g*h)-i";

        Stack<Character> st = new Stack<Character>();
        String post = "";

        char x;
        for(int i=0; i<in.length(); i++) {
            x = in.charAt(i);

            if((x >= 'a' && x <= 'z') || (x >= 'A' && x <= 'Z') || (x >= '0' && x <= '9')) {
                post += x;
            }

            else if(x == '(') st.push(x);

            else if(x == ')') {
                while(!st.isEmpty() && st.peek() != '(') post += st.pop();
                st.pop();
            }

            else {
                while(!st.isEmpty() && prec(x) <= prec(st.peek()) && asso(x)) post += st.pop();
                st.push(x);
            }
        }

        while(!st.isEmpty()) post += st.pop();

        System.out.println(post);
    }

    static int prec(char x) {
        if(x == '^') return 3;
        if(x == '/' || x == '*') return 2;
        if(x == '+' || x == '-') return 1;
        return -1;
    }

    static boolean asso(char x) {
        return x != '^';
    }
}
