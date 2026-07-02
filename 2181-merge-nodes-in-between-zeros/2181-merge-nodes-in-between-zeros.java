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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp=head;
        ArrayList<Integer> res=new ArrayList<>();
        int sum=0;
        while(temp!=null){
            if(temp.val==0){
                res.add(sum);
                sum=0;
            }
            sum+=temp.val;
            
            temp=temp.next;
        }
        ListNode ans=new ListNode(-1);
        ListNode dummy=ans;

        for(int i=1;i<res.size();i++){
            ListNode k=new ListNode(res.get(i));
            dummy.next=k;
            dummy=dummy.next;
        }
        return ans.next;
    }
}