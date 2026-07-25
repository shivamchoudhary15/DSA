class Solution {
    public int maxProduct(int n) {
        int max=0;
        int m=n;  
      
        while(m>0){
            int k=m%10;
            max=Math.max(max,k);
            m=m/10;
        } 
        
        String s=""+n;
        StringBuilder res=new StringBuilder(s);
        char j=(char) (max+'0');
        int i=s.indexOf(String.valueOf(j));
        if(i!= -1){
            res.deleteCharAt(i);
            }
        int l=Integer.parseInt(res.toString());
        int smax=0;
        while(l>0){
            int k=l%10;
            
                smax=Math.max(smax,k);

            l=l/10;
        }
        return smax*max;
    }
}