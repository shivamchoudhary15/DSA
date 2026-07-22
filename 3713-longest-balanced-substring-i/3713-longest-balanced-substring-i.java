class Solution {
    public int longestBalanced(String s) {
         int ans=0;
         int n=s.length();
        for (int i=0;i<n;i++) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int j = i; j < n; j++) {
                char c = s.charAt(j);
                map.put(c,map.getOrDefault(c, 0) + 1);
                int freq=-1;
                boolean ok=true;
                for (int val:map.values()) {
                    if (freq==-1)
                        freq=val;
                    else if (freq!=val) {
                        ok = false;
                        break;
                    }
                }
                if(ok){
                    ans = Math.max(ans, j - i + 1);
                }
            }
        }
        return ans;
    }
}