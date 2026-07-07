class Solution {
    public String orderlyQueue(String s, int k) {
        if(k==1){
            String k1=s;
            for(int i=1;i<s.length();i++){
                String l=s.substring(i)+s.substring(0,i);
                if(l.compareTo(k1)<0){
                    k1=l;
                }
            }
            return k1;
        }
        char arr[]=s.toCharArray();
        Arrays.sort(arr);
        StringBuilder res=new StringBuilder();
        for(char i:arr){
            res.append(i);
        }
        return res.toString();
    }
}