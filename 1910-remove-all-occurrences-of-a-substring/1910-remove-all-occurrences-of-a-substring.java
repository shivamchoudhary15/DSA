class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder  res=new StringBuilder(s);
        int idx;
        while ((idx = res.indexOf(part)) != -1) {
            res.delete(idx, idx + part.length());
        }
        return res.toString();
    
    }
}