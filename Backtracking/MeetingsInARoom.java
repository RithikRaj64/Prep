package Backtracking;

import java.util.*;

public class MeetingsInARoom {
    public static void main(String[] args) {
        int s[] = {1, 3, 5, 9, 11};
        int e[] = {2, 4, 10, 12, 15};
        int n = s.length;

        ArrayList<Meeting> li = new ArrayList<Meeting>();

        for(int i=0; i<n; i++) {
            li.add(new Meeting(s[i], e[i]));
        }

        Collections.sort(li, new Comparator<Meeting>() {
            @Override
            public int compare(Meeting a, Meeting b) {
                return a.end - b.end;
            }
        });

        int count = 1;
        
        int i=0;
        int j=1;

        while (j<n) {
            if(li.get(i).end < li.get(j).start) {
                count++;
                i = j;
                j = i+1;
            }
            else j++;
        }
        
        System.out.println(count);
    }
}

class Meeting {
    int start;
    int end;

    Meeting(int start, int end) {
        this.start = start;
        this.end = end;
    }
}
