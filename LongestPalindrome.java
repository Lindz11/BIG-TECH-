class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> values = new HashMap<>(); 
        ArrayList<Integer> vals = new ArrayList<>(); 
        int ans = 0; 
        boolean one = false;
        // Keep a counter of the frequency of each letter that we see
        for(char c: s.toCharArray()) {
            if(!values.containsKey(c)) {
                values.put(c,1); 
            }
            else
            {
                values.put(c,values.get(c) + 1); 
            }
        }
        for(Integer c: values.values()) {
            // If it is an even number then automatically accep it
             if(c % 2 == 0) {
                ans+= c; 
            }
            else{
                // If it is an odd number and we haven't added another odd number to our answer accept it
                if(c % 2 == 1 && ans % 2 == 0) {
                     ans+=c;
                }
                // if we have already added one odd number then accept the number minus 1 to make it even
                else
                     ans+= c - 1; 
            }
        }
        
        return ans; 
    }
}
