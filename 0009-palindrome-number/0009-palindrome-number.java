class Solution {
    public boolean isPalindrome(int x) {
        String s=x+"";
        StringBuilder res=new StringBuilder(s);
        String s1=res.reverse().toString();
        if(s.equals(s1)) return true;

        return false;
    }
}