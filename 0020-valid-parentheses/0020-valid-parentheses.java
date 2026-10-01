class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char i:s.toCharArray()){
            if(i=='(' || i=='{' || i=='['){
                stack.push(i);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                char p=stack.pop();
                if((i==')' && p!='(') || (i=='}' && p!='{')|| (i==']' && p!='[')){
                    return false;
                }
            }
        }
        
            return stack.isEmpty();
    }
}
        