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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode head = ans;
        ListNode i = list1;
        ListNode j = list2;
        while(i!=null && j!=null){

            if(i.val<j.val){
                ListNode curr = new ListNode(i.val);
                ans.next=curr;
                ans=curr;
                i=i.next;
            }
            else {
                ListNode curr = new ListNode(j.val);
                ans.next=curr;
                ans=curr;
                j=j.next;
            }

            
        }

        if(i != null){
            while(i!=null){
                ListNode rem_i = new ListNode(i.val);
                ans.next= rem_i;
                ans=rem_i;
                i=i.next;
            }
        }
        if(j != null){
            while(j!=null){
                ListNode rem_j = new ListNode(j.val);
                ans.next= rem_j;
                ans=rem_j;
                j=j.next;
            }
        }
        return head.next;
    }
}