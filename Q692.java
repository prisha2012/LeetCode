class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        Map<String,Integer> map=new HashMap<>();
        for(String s:words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        PriorityQueue<String> ab=new PriorityQueue<>((a,b)->map.get(a).equals(map.get(b))?b.compareTo(a):map.get(a)-map.get(b));
        for(String s:map.keySet()){
            ab.add(s);
            if(ab.size()>k)ab.poll();

        }
        List<String> res = new ArrayList<>();
         while(!ab.isEmpty()) res.add(ab.poll()); 
         Collections.reverse(res); 
         return res;


    }
}
public class Q692 {
    
}
