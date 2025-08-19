/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1=headA;
        ListNode temp2=headB;
        int la=0,lb=0;
        while(temp1!=null){
            la++;
            temp1=temp1.next;
        }
       
          while(temp2!=null){
            lb++;
            temp2=temp2.next;
        }
        temp1=headA;
        temp2=headB;
        if(la>lb){
            int steps=la-lb;
            for(int i=0;i<steps;i++){
                temp1=temp1.next;
            }

        }
        else{
            int steps=lb-la;
            for(int i=0;i<steps;i++){
                temp2=temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1=temp1.next;
            temp2=temp2.next;

        }
        return temp1;

    }
}
public class Q160 {
    
}
