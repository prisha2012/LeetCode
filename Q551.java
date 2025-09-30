class Solution {
    public boolean checkRecord(String s) {
        int countA = 0, countL = 0;
        for (char c : s.toCharArray()) {
            if (c == 'A') {
                countA++;
                if (countA > 1) return false;
                countL = 0;
            } else if (c == 'L') {
                countL++;
                if (countL > 2) return false;
            } else {
                countL = 0;
            }
        }
        return true;
    }
}

public class Q551 {
    
}
