class Solution {
    public int compress(char[] chars) {
      StringBuilder res=new StringBuilder();
      int i=0;
      while(i<chars.length){
        char ch=chars[i];
        int count=0;
        while(i<chars.length && chars[i]==ch){
            count++;
            i++;
        }
        res.append(ch);
        if(count>1){
            res.append(""+count);
        }
      }
      String s=res.toString();
      for(int j=0;j<s.length();j++){
        chars[j]=s.charAt(j);
      }
      return res.length();
    }
}