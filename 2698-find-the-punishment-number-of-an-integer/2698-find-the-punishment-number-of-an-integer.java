class Solution {
    public int punishmentNumber(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i==1 || i==0 || i==10 || i==36){
                sum+=i*i;
            }
            else{
                String s=""+(i*i);
                if(partition(s,0,i)){
                    sum+=i*i;
                }
            }
        }
        return sum;
    }
    boolean partition(String s, int index, int target){
        if (index == s.length()) {
            return target == 0;
        }
        for (int i = index; i < s.length(); i++) {
            int num = Integer.parseInt(s.substring(index, i + 1));
                if (partition(s, i + 1, target - num)){
                     return true;
                }
        }
        return false;
    }
}
