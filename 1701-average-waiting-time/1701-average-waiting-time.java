class Solution {
    public double averageWaitingTime(int[][] c) {
        double  ans=0;
        int count=0;
        double a=-1;
        double b=-1;
        for(int i[]:c){
            if(count==0){
                int k=i[0]+i[1];
                ans+=k-i[0];
                a=k; 
                b=k; 
                count++;
                
            
            }
            else{
                if(a>=i[0]){
                    b=b+i[1]; 
                    ans+=b-i[0];
                    a=b;
               
                }
                else{
                    b=i[0]+i[1];
                    ans += b - i[0];
                    a = b;
                    
                }
            }
        }
        return ans/c.length;
    }
}
