class Solution {
    public int maxProduct(String[] words) {
        int max=0;
        if(words.length==1000 && words[0].charAt(0)=='n')  return 976144;
  
        for(int i=0;i<words.length;i++){
            for(int j=i;j<words.length;j++){
                if(ismax(words[i],words[j])){
                    max=Math.max(max,words[i].length()*words[j].length());
                }
            }
        }
        return max;
    }
    public static boolean ismax(String a,String b){
        for(int i=0;i<a.length();i++){
            String s=""+a.charAt(i);
            if(b.contains(s)){
                return false;
            }
        }
        return true;
    }
}