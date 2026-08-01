/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void valid(TreeNode root,ArrayList<Integer> res){
        if(root==null){
            return ;
        }
        valid(root.left,res);
        res.add(root.val);
        valid(root.right,res);
    }

    public boolean isValidBST(TreeNode root) {
        if(root==null){
            return true;
        }
        ArrayList<Integer> res=new ArrayList<>();
        valid(root,res);

        for(int i=0;i<res.size()-1;i++){
            if(res.get(i+1)<=res.get(i)){
                return false;
            }
        }
        return true;
    }
}