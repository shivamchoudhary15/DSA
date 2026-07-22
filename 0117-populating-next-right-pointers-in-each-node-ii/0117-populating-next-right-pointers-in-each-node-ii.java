/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        if(root==null) return root;
        Queue<Node> pq=new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()){
            int m=pq.size();
            Node prev=null;
            for(int i=0;i<m;i++){
                Node curr=pq.poll();
                if (prev != null) {
                    prev.next = curr;
                }
                if(curr.left!=null){
                    pq.add(curr.left);
                }
                if(curr.right!=null){
                    pq.add(curr.right);
                }
                prev=curr;
            }
            prev.next=null;
        }
        return root;
    }
}