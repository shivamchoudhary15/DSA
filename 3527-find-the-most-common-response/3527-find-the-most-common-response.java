class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        HashMap<String,Integer> map=new HashMap<>();
        int max=0;
        for(List<String> r:responses){
            HashSet<String> set=new HashSet<>(r);
            for(String x:set){
                map.put(x,map.getOrDefault(x,0)+1);
                max=Math.max(max,map.get(x));
            }
        }
        String ans="";
        for(String x:map.keySet()){
            if(map.get(x)==max){
                if(ans.equals("")||x.compareTo(ans)<0){
                    ans=x;
                }
            }
        }
        return ans;

    }
}