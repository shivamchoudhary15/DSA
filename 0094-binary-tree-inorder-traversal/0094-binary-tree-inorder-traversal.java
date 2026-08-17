
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