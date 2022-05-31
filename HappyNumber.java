class Solution {
    public boolean isHappy(int n) {
        // This problem involves a while loop and modular math arithmetic
        if(n == 1)
            return true; 
        int sum; 
        HashSet<Integer> seen = new HashSet<>(); 
        while(n != 1) {
            sum = 0; 
            seen.add(n); 
            while(n!=0) { 
                sum+= (n % 10) * (n % 10); 
                n/=10; 
            }
            if(sum == 1)
                return true;
            if(seen.contains(sum))
                return false;
            n = sum; 
        }
        
        return false;
    }
}
