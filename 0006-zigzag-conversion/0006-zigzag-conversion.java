class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] r= new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            r[i] = new StringBuilder();
        }

        int cr = 0;
        boolean d= true;

        for(char ch:s.toCharArray()){
            r[cr].append(ch);
            if(cr==0){
                d=true;
            }
            else if(cr==numRows-1){
                d=false;
            }

            if(d){
                cr++;
            }
            else{
                cr--;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (StringBuilder row : r) {
            ans.append(row);
        }
        return ans.toString();

    }
    
}