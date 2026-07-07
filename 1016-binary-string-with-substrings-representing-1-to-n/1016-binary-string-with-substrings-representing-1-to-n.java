class Solution {
    public boolean queryString(String s, int n) {
        for(int i=1;i<=n;i++){
            String b= Integer.toBinaryString(i);
            if(!s.contains(b)){
                return false;
            }
        }
        return  true;
    }
}