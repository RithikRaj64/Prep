package String;

public class KMP {
    public static void main(String[] args) {
        String st = "xyxyxyzxyxycd";
        String pt = "xyxy";

        int lps[] = computeLPS(pt);

        int i=0;
        int j=0;
        boolean flag = true;

        while(i < st.length()) {
            j = 0;
            
            while(i < st.length() && j < pt.length()) {
                if(st.charAt(i) == pt.charAt(j)) {
                    i++;
                    j++;
                }
                else if(j != 0) {
                    j = lps[j - 1];
                }
                else {
                    i++;
                }
            }

            if(j == pt.length()) {
                flag = false;
                System.out.println("Pattern at index " + (i - j));
            }
        }

        if(flag) System.out.println("Pattern not found");
    }

    static int[] computeLPS(String pt) {
        int n = pt.length();

        int ar[] = new int[n];

        int l = 0;
        ar[0] = 0;

        for(int i=1; i<n; i++) {
            if(pt.charAt(l) == pt.charAt(i)) {
                l++;
                ar[i] = l;
            }
            else {
                while(l > 0) {
                    l--;
                    if(pt.charAt(l) == pt.charAt(i)) {
                        l++;
                        ar[i] = l;
                        break;
                    }
                }

                ar[i] = l;
            }
        }

        return ar;
    }
}
