import java.util.Scanner;
import java.util.Stack;

public class LongestBalancedString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(fun(s));
        sc.close();
    }
    
    static int fun(String s) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(-1);
        
        char x;
        int r = 0;
        for(int i=0; i<s.length(); i++) {
            x = s.charAt(i);
            
            if(x == '(') {
                st.push(i);
            }
            
            else {
                if(!st.isEmpty()) {
                    st.pop();
                }
                
                if(!st.isEmpty()) {
                    r = Math.max(r, (i - st.peek()));
                }
                else {
                    st.push(i);
                }
            }
        }
                
        return r;
    }
}
