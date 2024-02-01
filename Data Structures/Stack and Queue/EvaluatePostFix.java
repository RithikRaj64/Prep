import java.util.Stack;

public class EvaluatePostFix {
    public static void main(String[] args) {
        String post = "231*+9-";

        Stack<Integer> st = new Stack<Integer>();

        char x;
        int a, b;
        for(int i=0; i<post.length(); i++) {
            x = post.charAt(i);

            if(Character.isDigit(x)) st.push(x - '0');

            else {
                a = st.pop();
                b = st.pop();
                switch (x) {
                    case '+':
                        st.push(b + a);
                        break;
                    case '-':
                        st.push(b - a);
                        break;
                    case '*':
                        st.push(b * a);
                        break;
                    case '/':
                        st.push(b / a);
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println(st.pop());
    }   
}
