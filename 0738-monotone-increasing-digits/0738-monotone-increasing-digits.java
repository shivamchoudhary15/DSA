class Solution {
    public int monotoneIncreasingDigits(int n) {
        String s=""+n;
        int marker = s.length();
        char arr[]=s.toCharArray();
        for(int i=arr.length-1;i>0;i--){
            if(arr[i-1]>arr[i]){
                marker = i;
                int m = arr[i - 1]-'0';
                m--;
                arr[i - 1] = (char)(m + '0');
            }
        }
        for (int i =marker; i<arr.length;i++) {
            arr[i] = '9';
        }
        StringBuilder res=new StringBuilder();
        for(char i:arr){
            res.append(i);
        }
        return Integer.parseInt(res.toString());
    }
}