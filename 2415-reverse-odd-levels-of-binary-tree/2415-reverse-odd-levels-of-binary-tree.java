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
    public TreeNode reverseOddLevels(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        q.add(root);
        ArrayList<ArrayList<TreeNode>> res=new ArrayList<>();
        int l=0;
        while(!q.isEmpty()){
            int m=q.size();
            ArrayList<TreeNode> k=new ArrayList<>();
            for(int i=0;i<m;i++){
                TreeNode s=q.poll();
                k.add(s);
                if(s.left!=null){
                    q.add(s.left);
                }
                if(s.right!=null){
                    q.add(s.right);
                }
            }
            if (l % 2 == 1) {
                    int i = 0, j = k.size() - 1;
                  while (i < j) {
                    int temp = k.get(i).val;
                      k.get(i).val = k.get(j).val;
                      k.get(j).val = temp;
                       i++;
                       j--;
                   }
            }
            l++;
            
        }
        
        return root;
    }
}