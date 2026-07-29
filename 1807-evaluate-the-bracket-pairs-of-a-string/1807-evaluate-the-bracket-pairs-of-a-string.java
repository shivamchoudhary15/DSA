class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder res=new StringBuilder();
        HashMap<String, String> map = new HashMap<>();
        for (List<String> p : knowledge) {
            map.put(p.get(0), p.get(1));
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='('){
                String a="";
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(j)==')'){
                        break;
                    }
                    a+=s.charAt(j);
                    
                    
                }
                if(map.containsKey(a)){
                    res.append(map.get(a));
                }
                else{
                    res.append("?");
                }
                i=i+a.length()+1;
            
              
            }
            else{
                res.append(s.charAt(i));
            }
        }
        return res.toString();
    }
}