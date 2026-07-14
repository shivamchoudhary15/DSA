class Solution {
    public boolean equalFrequency(String word) {
        int[] freq = new int[26];

        for (char ch : word.toCharArray()) {
            freq[ch - 'a']++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]==0) continue;

            freq[i]--;
            boolean flag=true;
            int target=0;
            for(int j=0;j<freq.length;j++){
                if(freq[j]==0) continue;
                
                if(target==0){
                    target=freq[j];
                }
                else{
                    if(target!=freq[j]){
                        flag=false;
                        break;
                    }
                }
            }
            freq[i]++;
            if(flag) return true;
        }
        return false;
    }
}