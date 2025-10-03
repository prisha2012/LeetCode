/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        if (head==null)return;
        Deque<Integer> dq=new ArrayDeque<>();
        ListNode temp=head;
        while(temp!=null){
            dq.addLast(temp.val);
            temp=temp.next;
        }
        temp=head;
        int index=0;
        while(!dq.isEmpty()){
            if(index%2==0){
                temp.val=dq.pollFirst();
            }
            else{
                temp.val=dq.pollLast();
            }
            index++;
            temp=temp.next;
        }
    }
}
public class Q143 {
    
}
