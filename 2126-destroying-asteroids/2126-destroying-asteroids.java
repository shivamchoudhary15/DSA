class Solution {
    public boolean asteroidsDestroyed(int mass, int[] arr){
        Arrays.sort(arr); 
        long c=mass;
        for(int i:arr){
            if(c<i){
                return false;
            }
            c+=i;
        }   
        return true;
    }
}