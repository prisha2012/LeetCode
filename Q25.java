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
    public ListNode reverseKGroup(ListNode head, int k) {
        Stack<ListNode> s=new Stack<> ();
        ListNode dummy=new ListNode(0);
        ListNode prev=dummy;
        ListNode curr=head;
        while(curr!=null){
        int cnt=0;
        ListNode temp=curr;
        while(cnt<k&&temp!=null){
            s.push(temp);
            temp=temp.next;
            cnt++;
        }
           if (cnt < k) {
                prev.next = curr;
                break;
            }
        while(!s.isEmpty()){
            prev.next=s.pop();
            prev=prev.next;

        }
        prev.next=temp;
        curr=temp;
        }

        return dummy.next;
    }
}
public class Q25 {
    
}
