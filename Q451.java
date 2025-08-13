
class Solution {
    public String frequencySort(String s) {
        if (s.length() < 2) return s;
        Map<Character, Integer> m = new HashMap<>();
        for (char c : s.toCharArray()) m.put(c, m.getOrDefault(c, 0) + 1);
        List<Character>[] buckets = new List[s.length() + 1];
        for (Map.Entry<Character, Integer> e : m.entrySet()) {
            int f = e.getValue();
            if (buckets[f] == null) buckets[f] = new ArrayList<>();
            buckets[f].add(e.getKey());
        }
        StringBuilder sb = new StringBuilder();
        for (int f = buckets.length - 1; f >= 0; f--) {
            if (buckets[f] != null) {
                for (char c : buckets[f]) {
                    for (int i = 0; i < f; i++) sb.append(c);
                }
            }
        }
        return sb.toString();
    }
}
public class Q451 {
    
}
