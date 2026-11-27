class Solution {
    public boolean canAliceWin(int n) {
        int l=10;
        boolean alice =true;
        while (n>=l){
            n=n-l;
            if (n <=0) {
                return alice;
            }
            l--;
            alice = !alice;
        }
        return !alice;
    }
}