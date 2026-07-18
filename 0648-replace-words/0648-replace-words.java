class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder res=new StringBuilder();
        String arr[]=sentence.split(" ");
        for(String i:arr){
            boolean flag=false;
            String s=i;
            for(String j:dictionary){
                if(i.startsWith(j) && j.length()<s.length()){
                    flag=true;
                    s=j;
                 
                }
            }
            if(flag){
                res.append(s);
                res.append(" ");
            }
            else{
                res.append(i);
                res.append(" ");
            }
        }  
        String s=res.toString();
        return s.substring(0,s.length()-1);
        
    }
}