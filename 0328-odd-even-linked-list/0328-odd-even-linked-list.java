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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<Integer> res1=new ArrayList<>();
        int count=0;
        while(temp!=null){
            if(count%2==0){
                res.add(temp.val);
                temp=temp.next;
                count++;
            }
            else{
                 res1.add(temp.val);
                 temp=temp.next;
                 count++;
            }
        }
        for(int i:res1){
            res.add(i);
        }
       ListNode ans=new ListNode(-1);
       ListNode dummy=ans;
       for(int i:res){
         ListNode t=new ListNode(i);
         dummy.next=t;
         dummy=dummy.next;
       }
        return  ans.next;
    }
}