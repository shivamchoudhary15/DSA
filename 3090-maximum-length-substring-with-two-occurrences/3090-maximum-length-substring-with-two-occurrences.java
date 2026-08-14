class Solution {
    public int maximumLengthSubstring(String s) {
        int max=0;

        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                String k=s.substring(i,j+1);
                if(isvalid(k)){
                    max=Math.max(max,k.length());
                }
            }
        }
    
        return max;
    }
    public static boolean isvalid(String k){
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:k.toCharArray()){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(char x : map.keySet()){
            if(map.get(x)>2){
                return false;
            }
        }
        return true;
    }
}