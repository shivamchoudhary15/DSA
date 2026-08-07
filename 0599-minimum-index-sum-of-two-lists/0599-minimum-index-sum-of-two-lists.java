class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> res=new ArrayList<>();
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
               if (list1[i].equals(list2[j])) {
                   if (i + j<min) {
                      min = i + j;
                      res.clear();         
                       res.add(list1[i]);
                     } else if (i+j == min) {
                        res.add(list1[i]);
                    }
                }
            }
        }
        System.out.print(min);
        String arr[]=new String[res.size()];
        for(int i=0;i<res.size();i++){
            arr[i]=res.get(i);
        }
        return arr;
          

    }
}