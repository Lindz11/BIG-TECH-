class Solution {
    public int romanToInt(String s) {
        // I can use a hashmap to map all of the characters to                their values
        HashMap<Character, Integer> roman = new HashMap<>(); 
        roman.put('I',1); 
        roman.put('V',5);
        roman.put('X',10);
        roman.put('L',50);
        roman.put('C',100);
        roman.put('D',500);
        roman.put('M',1000);
        int sum = 0; 
        for(int i = 0; i < s.length(); i++) {
            if(i > 0 && s.charAt(i) == 'V' && s.charAt(i - 1) == 'I' || i > 0 && s.charAt(i) == 'X' && s.charAt(i - 1) == 'I')
                sum-= 2; 
            if(i > 0 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'X' ||i > 0 && s.charAt(i) == 'C' && s.charAt(i - 1) == 'X')
                sum-= 20; 
            if(i > 0 && s.charAt(i) == 'D' && s.charAt(i - 1) == 'C' || i > 0 && s.charAt(i) == 'M' && s.charAt(i - 1) == 'C')
                sum-=200; 
            sum+=roman.get(s.charAt(i));
        }
        return sum; 
    }
}
