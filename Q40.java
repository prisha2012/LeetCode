import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int remain, int start, List<Integer> combination, List<List<Integer>> result) {
        if (remain == 0) {
            result.add(new ArrayList<>(combination));
            return;
        }
        if (remain < 0) {
            return;
        }
        for (int i = start; i < candidates.length; i++) {
            if (i > start && candidates[i] == candidates[i - 1]) continue;

            combination.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], i + 1, combination, result); // no reuse
            combination.remove(combination.size() - 1);
        }
    }
}

public class Q40 {
    
}
