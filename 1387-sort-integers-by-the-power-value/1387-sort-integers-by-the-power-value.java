class Solution {
    public int getKth(int lo, int hi, int k) {
        ArrayList<Integer> res=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        while(lo<=hi){
            int k1=ispower(lo);
            map.put(lo,k1);
            res.add(lo);
            lo++;
        }
        Collections.sort(res, (a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                return a - b;    
                }
            return map.get(a) - map.get(b);
            });
        return res.get(k - 1);
    }
    public static int ispower(int n){
        int count=0;
        while(n!=1){
            if(n%2==0){
                n=n/2;
            }
            else{
                n=3*n+1;
            }
            count++;
        }
        return count;
    }
}