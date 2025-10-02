class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> map=new HashMap<>();
        for(String word:strs){
            char[] arr=word.toCharArray();
            Arrays.sort(arr);
            String n=new String(arr);

            if(!map.containsKey(n)){
                map.put(n,new ArrayList<>());
            }
            map.get(n).add(word);
        }
        return new ArrayList<>(map.values());
    }
}
public class Q49 {
    
}
