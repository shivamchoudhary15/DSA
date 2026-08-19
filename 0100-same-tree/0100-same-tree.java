class Solution {
    static void inorder(TreeNode c, ArrayList<Integer> res) {
        if(c == null){
            res.add(-2);
            return;
        }
        res.add(c.val);
        inorder(c.left, res);
        inorder(c.right, res);
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        inorder(p, a);
        inorder(q, b);
        if(a.size() != b.size()) return false;
        for(int i = 0; i < a.size(); i++) {
            if(!a.get(i).equals(b.get(i))) {
                return false;
            }
        }
        return true;
    }
}
