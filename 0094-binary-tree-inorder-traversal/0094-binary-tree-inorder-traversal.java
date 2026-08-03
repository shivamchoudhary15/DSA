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
    public static void trev(TreeNode root ,ArrayList<Integer> res){
        if(root==null){
           return ; 
        }
        trev(root.left,res);
        res.add(root.val);
        trev(root.right,res);
    }
    public List<Integer> inorderTraversal(TreeNode root) {
       ArrayList<Integer> res=new ArrayList<Integer>();

       trev(root,res);

       return res; 
    }
}