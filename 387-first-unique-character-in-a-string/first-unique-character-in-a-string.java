class Solution {
    public int firstUniqChar(String s) {
        int len = s.length();
        int[] freq = new int[256]; 

        
        for (int i = 0; i < len; i++) {
            freq[s.charAt(i)]++;
        }

      
        for (int i = 0; i < len; i++) {
            if (freq[s.charAt(i)] == 1) {
                return i; 
            }
        }

      
        return -1;
    }
}
