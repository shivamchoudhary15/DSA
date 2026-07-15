class Solution {
    public int gcdOfOddEvenSums(int n) {
        int sumodd=0;
        int sumeven=0;
        int count=0;
        int i=1;
        while(count!=n){
            if(i%2!=0){
                count++;
                sumodd+=i;
            }
            i++;
        }
        count=0;
        i=1;
        while(count!=n){
            if(i%2==0){
                count++;
                sumeven+=i;
            }
            i++;
        }
        int min=Math.min(sumeven,sumodd);
        int ans=0;
        for(int j=1;j<=min;j++){
            if(sumodd%j==0 && sumeven%j==0){
                 ans=j;
            }
        }
        return ans;
    }
}