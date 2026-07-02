class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        int i=0;
        while(i<=num){
            StringBuilder res=new StringBuilder(""+i);
            String s=res.reverse().toString();
            int m=Integer.parseInt(s);
            if(i+m==num){
                return true;
            }
            i++;
        }
        return false;
    }
}