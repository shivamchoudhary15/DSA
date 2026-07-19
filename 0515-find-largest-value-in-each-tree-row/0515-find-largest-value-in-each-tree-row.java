class Solution {
    public List<Integer> largestValues(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();
        Queue<TreeNode> pq=new LinkedList<>();
        List<Integer> ans=new ArrayList<>();
        pq.add(root);
        if(root==null) return  ans;
        while(!pq.isEmpty()){
            int m=pq.size();
            ArrayList<Integer> k=new ArrayList<>();
            for(int i=0;i<m;i++){
                
                TreeNode s=pq.poll();
                k.add(s.val);
                if(s.left!=null){
                    pq.add(s.left);
                }
                if(s.right!=null){
                    pq.add(s.right);
                }
            }
            res.add(k);
        }
        for(int i=0;i<res.size();i++){
            int max=Integer.MIN_VALUE;
            for(int j=0;j<res.get(i).size();j++){
                max=Math.max(max,res.get(i).get(j));
            }
            ans.add(max);
        }
        return ans;
    }
}