class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int i=0;
        int j=tokens.length-1;
        int s=0;
        int max=0; 
        while(i<=j){
            if(power>=tokens[i]){
                s++;   
                max=Math.max(s,max);
                power-=tokens[i];   
                i++;
            }
            else if(s>0){
                s--;
                power+=tokens[j];   
                j--; 
            }
            else{
                break;
            }
           
        }
        return max;
    }
}