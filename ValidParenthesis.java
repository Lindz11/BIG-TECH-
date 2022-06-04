class Solution {
    public boolean isValid(String s) {
        // I think this problem can be solved using a stack and a for loop
        Stack<Character> stack = new Stack<>(); 
        for(int i = 0; i < s.length(); i ++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' )
                stack.push(s.charAt(i)); 
            else if(s.charAt(i) == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop(); 
            else if(s.charAt(i) == ']' && !stack.isEmpty() && stack.peek() == '[')
                stack.pop(); 
            else if(s.charAt(i) == '}' && !stack.isEmpty() && stack.peek() == '{')
                stack.pop(); 
            else 
                stack.push(s.charAt(i)); 
        
        }
        
        if(stack.isEmpty())
            return true; 
        return false; 
    }
}
