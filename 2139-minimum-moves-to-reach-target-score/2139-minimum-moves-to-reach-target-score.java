class Solution {
    public int minMoves(int target, int d) {
        int count=0;
        if(target==1){
            return  0;
        }
        if(d==0) return target-1;
        while(d>0){ 
            if(target%2==0){
                int s=target/2;
                
                if(s==1){
                    return count+1;
                }
                else{
                    target=s; 
                }
                count++;  
                d--; 
            }
            else {
                target=target-1; 
                count++;  
            }

        }
        return count+(target-1);
    }
}