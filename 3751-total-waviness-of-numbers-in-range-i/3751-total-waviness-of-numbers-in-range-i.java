class Solution {
    public int totalWaviness(int num1, int num2) {
        int count=0;
        while(num1<=num2){
            String s=""+num1;
            if(s.length()>=3){
                int n=iswave(num1);
                count+=n;
            }
            num1++;
        }
        return count;
    }
    public static int  iswave(int n){
        int ans=0;
        ArrayList<Integer> res=new ArrayList<>();
        while(n>0){
            int k=n%10;
            res.add(k);
            n=n/10;
        }
        Collections.reverse(res);
        for(int i=1;i<res.size()-1;i++){
            if(res.get(i-1)<res.get(i) && res.get(i+1)<res.get(i)){
                ans++;
            }
            else if(res.get(i-1)>res.get(i) && res.get(i+1)>res.get(i)){
                ans++;
            }
        }
        return ans;
        
    }
}