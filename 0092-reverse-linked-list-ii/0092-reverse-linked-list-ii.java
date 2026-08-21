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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if(head==null){
            return null;
        }
        ListNode temp=head;
        ArrayList<Integer> res=new ArrayList<>();
        while(temp!=null){
            res.add(temp.val);
            temp=temp.next;
        }
        int n=res.size();
        rotate(res,left-1,right-1);
        ListNode dummy=new ListNode(0);
        ListNode m=dummy;
        for(int num:res){
            m.next=new ListNode(num);
            m=m.next;
        }
        return dummy.next;
    }
    public static void rotate(ArrayList<Integer> res,int left,int right){
        while(right>left){
            int t=res.get(left);
            res.set(left,res.get(right));
            res.set(right,t);
            right--;
            left++;
        } 
    }
}