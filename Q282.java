import java.util.*;

class Solution {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        solve(0, num, target, "", ans, 0, 0);
        return ans;
    }

    private void solve(int index, String num, int target,
                       String curr, List<String> ans,
                       long prev, long res) {
        // Base case: if we've used all digits
        if (index == num.length()) {
            if (res == target) {
                ans.add(curr);
            }
            return;
        }

        long currRess = 0;
        for (int i = index; i < num.length(); i++) {
            // Prevent numbers with leading zero (e.g., "05")
            if (i > index && num.charAt(index) == '0') break;

            // Extract current number
            currRess = currRess * 10 + (num.charAt(i) - '0');
            String part = num.substring(index, i + 1);

            if (index == 0) {
                // First number (no operator before it)
                solve(i + 1, num, target, part, ans, currRess, currRess);
            } else {
                solve(i + 1, num, target, curr + "+" + part, ans, currRess, res + currRess);
                solve(i + 1, num, target, curr + "-" + part, ans, -currRess, res - currRess);
                solve(i + 1, num, target, curr + "*" + part, ans,
                      prev * currRess, res - prev + prev * currRess);
            }
        }
    }
}

public class Q282 {
    
}
