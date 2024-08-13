class Solution {
    public int findLUSlength(String[] strs) {
        int n = strs.length;
        Set<String> uniqueStrings = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        // Step 1: Identify duplicates and unique strings
        for (String s : strs) {
            if (!uniqueStrings.add(s)) {
                duplicates.add(s); // Track duplicates
            }
        }

        // Step 2: Identify the longest uncommon subsequence
        int maxLength = -1;
        for (String s : strs) {
            if (duplicates.contains(s)) {
                continue; // Skip duplicates
            }
            boolean isUncommon = true;
            for (String other : strs) {
                if (!s.equals(other) && isSubsequence(s, other)) {
                    isUncommon = false;
                    break;
                }
            }
            if (isUncommon) {
                maxLength = Math.max(maxLength, s.length());
            }
        }
        
        return maxLength;
    }

    // Method to check if s1 is a subsequence of s2
    private boolean isSubsequence(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int p = 0, q = 0;
        
        while (p < m && q < n) {
            if (s1.charAt(p) == s2.charAt(q)) {
                p++;
            }
            q++;
        }
        
        return p == m;
    }
    }
