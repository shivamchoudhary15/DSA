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
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> res=new ArrayList<>();
        if(root==null){
            return new ArrayList<>();
        }
        Queue<TreeNode> pq=new LinkedList<>();
        pq.add(root);
        while(!pq.isEmpty()){
            int m=pq.size();
            double sum=0;
            int count=0;
            for(int i=0;i<m;i++){
                TreeNode s=pq.poll();
                sum+=s.val;
                count++;
                if(s.left!=null){
                    pq.add(s.left);
                }
                if(s.right!=null){
                    pq.add(s.right);
                }
            } 
            System.out.println(sum);
            res.add(sum/count);
        }
        return res;
    }

}