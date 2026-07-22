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
    public ListNode partition(ListNode head, int x) {
        ArrayList<Integer> res1=new ArrayList<>();
         ArrayList<Integer> res2=new ArrayList<>();
         ListNode temp=head;
         while(temp!=null){
            if(temp.val<x){
                res1.add(temp.val);
            }
            else{
                res2.add(temp.val);
            }
            temp=temp.next;
         }
         res1.addAll(res2);
         ListNode ans=new ListNode(-1);
         ListNode dummy=ans;
         for(int i:res1){
            ListNode s=new ListNode(i);
            dummy.next=s;
            dummy=dummy.next;
         }
         return ans.next;
    }
}