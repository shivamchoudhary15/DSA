class Solution {
    public int[][] merge(int[][] arr) {
        Arrays.sort(arr,(a,b) ->Integer.compare(a[0],b[0]));
        ArrayList<int []> ans=new ArrayList<>();
        int s=arr[0][0];
        int e=arr[0][1];
        if(arr.length==1) return arr;
        for(int i=1;i<arr.length;i++){
            int cs=arr[i][0];
            int ce=arr[i][1];
            if(e>=cs){
                e=Math.max(e,ce);
            }
            else{
                 ans.add(new int[]{s, e});
                 s=cs;
                 e=ce;
            }
        }
        ans.add(new int[]{s,e});
        return ans.toArray(new int[ans.size()][]);
    }
}