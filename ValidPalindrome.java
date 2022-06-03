class Solution {
    public boolean isPalindrome(String s) {
        // I think this problem can be solve using string builder and isalpha function
        // I needed to use isdigit to account for both alpha and numberic elements
        StringBuilder forward = new StringBuilder(); 
        StringBuilder reverse = new StringBuilder();
        for(char ch : s.toCharArray()) {
            if(Character.isAlphabetic(ch) || Character.isDigit(ch))
                forward.append(Character.toLowerCase(ch));  
        }   
        reverse = forward.reverse(); 
        if(forward.toString().equals(reverse.reverse().toString()))
            return true; 
        return false; 
    }
}
