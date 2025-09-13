import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int steps = 1;
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                if (word.equals(endWord)) return steps;
                char[] arr = word.toCharArray();
                for (int j = 0; j < arr.length; j++) {
                    char temp = arr[j];
                    for (char c = 'a'; c <= 'z'; c++) {
                        arr[j] = c;
                        String next = new String(arr);
                        if (set.contains(next)) {
                            queue.add(next);
                            set.remove(next);
                        }
                    }
                    arr[j] = temp;
                }
            }
            steps++;
        }
        return 0;
    }
}

public class Q127 {
    
}
