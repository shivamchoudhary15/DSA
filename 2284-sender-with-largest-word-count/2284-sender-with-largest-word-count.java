class Solution {
    public String largestWordCount(String[] m, String[] s) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<m.length;i++){
            int words = m[i].split(" ").length;
            map.put(s[i], map.getOrDefault(s[i], 0) + words);
        }
        int max=0;
        String s1="";
        for(Map.Entry<String,Integer> e:map.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                s1=e.getKey();
            }
            else if(e.getValue()==max){
                if (e.getKey().compareTo(s1) > 0) {
                    s1 = e.getKey();
                }
            }
        }
        return s1;
    }
}