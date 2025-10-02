class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
    TreeSet <Long> set=new TreeSet<>();

    for(int i=0;i<nums.length;i++){
        long num=nums[i];

        Long c=set.ceiling(num);
        if(c!=null && c-num<=valueDiff) return true;

        Long f=set.floor(num);
        if(f!=null && num-f<=valueDiff) return true;

        set.add(num);

    if(i>=indexDiff){
        set.remove((long)nums[i-indexDiff]);
    }

    }

    return false;
    }
} 
public class Q220 {
    
}
