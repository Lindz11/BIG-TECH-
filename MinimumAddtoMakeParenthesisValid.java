class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length() == 0 || s.length() == 1)
            return s.length(); 
        Stack<Character> stack = new Stack<>(); 
        for(Character c : s.toCharArray()) {
            if(c == '(')
                stack.push(c); 
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
                stack.pop(); 
            else
                stack.push(c); 
        }
        return stack.size(); 
    }
}
