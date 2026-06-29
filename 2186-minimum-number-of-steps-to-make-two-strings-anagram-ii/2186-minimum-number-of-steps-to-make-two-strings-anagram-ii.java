class Solution {
    public int minSteps(String s, String t) {
        int[] f=new int[26];
        for (char c:s.toCharArray()) {
            f[c - 'a']++;
        }
        for(char c:t.toCharArray()) {
            f[c - 'a']--;
        }
        int ans=0;
        for (int x : f) {
            ans +=Math.abs(x);
        }

        return ans;
    }
}