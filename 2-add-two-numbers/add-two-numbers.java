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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1 == null)
        return l2;
        if(l2 == null)
        return l1;

        ListNode l3 = null;
        ListNode ans = null;
        int carry =0;
        while(l1!=null || l2!=null){
            int x,y;
            x = l1 == null ? 0:l1.val;
            y= l2 == null ? 0:l2.val;

            int val = x+y+carry;
            carry=0;
            if(val>=10){
                carry =1;
                val = val%10;
            }
            if(ans == null){
                l3 = new ListNode(val);
                ans = l3;
            }else{
                l3.next = new ListNode(val);
                l3 = l3.next;
            }
            if(l1!=null) l1 = l1.next;
            if(l2!=null) l2 = l2.next;
        }
        if(carry>0){
            l3.next = new ListNode(carry);
        }
        return ans;
    }
}