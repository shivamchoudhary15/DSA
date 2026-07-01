class Solution {
    public List<String> topKFrequent(String[] words, int k) {
      HashMap<String,Integer> map=new HashMap<>();
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (map.get(a).equals(map.get(b))) {
                 return b.compareTo(a);
            }
            return map.get(a) - map.get(b);
            }
        );

      for(String i:words){
        map.put(i,map.getOrDefault(i,0)+1);
      }
      for(Map.Entry<String,Integer> e:map.entrySet()){
            String i=e.getKey();
            int m=e.getValue();
            pq.offer(i);
            if(pq.size()>k){
                pq.poll();
            }        
      }
      List<String> res=new ArrayList<>();
      while(!pq.isEmpty()){
        res.add(pq.poll());
      }
      Collections.reverse(res);

      return res;
    }
}