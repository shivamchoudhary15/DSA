class Solution {
    public String reverseWords(String s) {
        String arr[]=s.split(" ");
        String a=arr[0];
        int count=0;
        StringBuilder res=new StringBuilder(a+" ");
        for(int i=0;i<a.length();i++){
            if(isvowel(a.charAt(i))){
                count++;
            }
        }
        int count1=0;
        for(int i=1;i<arr.length;i++){
            count1=0;
            for(int j=0;j<arr[i].length();j++){
                if(isvowel(arr[i].charAt(j))){
                    count1++;
                }
            }
            if(count1==count){
                StringBuilder k=new StringBuilder(arr[i]);
                k.reverse();
                res.append(k.toString()+" ");
            }
            else{
                res.append(arr[i]+" ");
            }
        }
        return res.toString().substring(0,res.length()-1);
    }
    public static boolean isvowel(char c){
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
            return true;
        }
        return false;
    }
}