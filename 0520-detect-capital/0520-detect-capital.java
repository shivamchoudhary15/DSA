class Solution {
    public boolean detectCapitalUse(String word) {
        char[] s=word.toCharArray();
        int count=0;

        for (int i=0;i<s.length; i++) {
            if (Character.isLowerCase(s[i])) {
                count++;
            }
        }
        if (count==s.length) {
            return true;
        }

        if (count==0) {
            return true;
        }
        if (Character.isUpperCase(s[0])) {
            for (int i=1;i<s.length;i++) {
                if (Character.isUpperCase(s[i])) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }
}
