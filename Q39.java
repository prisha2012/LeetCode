import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
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
            combination.add(candidates[i]);
            backtrack(candidates, remain - candidates[i], i, combination, result); // reuse allowed
            combination.remove(combination.size() - 1);
        }
    }
}

