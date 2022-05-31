class Solution {
    public int firstUniqChar(String s) {
        // I think this problem can be solved using a hashmap with a counter to keep count of everytime an character occurs
        HashMap<Character, Integer> occur = new HashMap<Character, Integer>(); 
        for(char ch: s.toCharArray()) {
            if(occur.containsKey(ch))
                occur.put(ch, occur.get(ch) + 1); 
           else
               occur.put(ch, 1);     
        }
        for(int i = 0; i < s.length(); i++) {
            if(occur.get(s.charAt(i)) == 1)
                return i; 
        }
        
        return -1; 
    }
}
