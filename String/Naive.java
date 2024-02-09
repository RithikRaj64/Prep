package String;

public class Naive {
    public static void main(String[] args) {
        String st = "xyzxyzxyzde";
        String pt = "xyz";

        int a = st.length();
        int b = pt.length();

        int i=0; 
        int j=0;
        int k;

        while (i < a) {
            j = 0;

            if(st.charAt(i) == pt.charAt(j)) {
                k = i;
                while ((k < a) && (j < b) && st.charAt(k++) == pt.charAt(j++)) continue;

                if(j == b) {
                    System.out.println("Pattern found at index " + i);
                    i = k;
                    continue;
                }
            }

            i++;
        }
    }
}
    