class Solution {
    public String sortVowels(String s) {
        StringBuilder res1=new StringBuilder();
        StringBuilder res2=new StringBuilder();
        boolean nums[]=new boolean[s.length()];
        for(int i=0;i<s.length();i++){
            if(isVowel(s.charAt(i))){
                res1.append(""+s.charAt(i));
                nums[i]=true;
            }
            else{
                res2.append(""+s.charAt(i));
            }
        }
        char[] arr = res1.toString().toCharArray();
        Arrays.sort(arr);
        StringBuilder s1= new StringBuilder(new String(arr));
        String s2=s1.toString();
        StringBuilder ans=new StringBuilder();
        int j=0;
        int k=0;

        for(int i=0;i<s.length();i++){
            if(nums[i]==true){
                ans.append(""+s2.charAt(j));
                j++;
            }
            else{
                ans.append(""+res2.toString().charAt(k));
                k++;

            }
        }
        return ans.toString();
        
    }
    public static boolean isVowel(char ch) {
       ch = Character.toLowerCase(ch);
          return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
