import java.util.Stack;

public class EvaluatePostFixMultiple {
    public static void main(String[] args) {
        String post = "100.2 200.5 + ";

        String arr[] = post.split(" ");

        Stack<Double> st = new Stack<Double>();

        String x;
        double a, b;
        for(int i=0; i<arr.length; i++) {
            x = arr[i];

            if(isNumeric(x)) {
                st.push(Double.parseDouble(x));
            }

            else {
                a = st.pop();
                b = st.pop();
                switch (x) {
                    case "+":
                        st.push(b + a);
                        break;
                    case "-":
                        st.push(b - a);
                        break;
                    case "*":
                        st.push(b * a);
                        break;
                    case "/":
                        st.push(b / a);
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.println(st.pop());
    }

    static boolean isNumeric(String x) {
        try {
            Double.parseDouble(x);
            return true;
        }
        catch (NumberFormatException e) {
            return false;
        }
    }
}
