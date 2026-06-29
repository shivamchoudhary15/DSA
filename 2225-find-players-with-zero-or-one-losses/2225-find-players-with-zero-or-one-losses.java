class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i[]:matches){
            int a=i[0];
            int b=i[1];
            map.putIfAbsent(a,0);
            map.put(b, map.getOrDefault(b, 0) + 1);

        }
        List<Integer> res1=new ArrayList<>();
          List<Integer> res2=new ArrayList<>();
          for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==0){
                res1.add(e.getKey());
            }
            else if(e.getValue()==1){
                res2.add(e.getKey());
            }
          }
          Collections.sort(res1);
          Collections.sort(res2);
          List<List<Integer>> k=new ArrayList<>();
          k.add(res1);
          k.add(res2);
          return k;

    }
}