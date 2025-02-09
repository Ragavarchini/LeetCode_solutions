class Solution {
    public boolean isIsomorphic(String s, String t) {
        int frq1[] = new int[200];
        int frq2[] = new int[200];
        if(s.length()!=t.length())
        return false;
        for(int i=0;i<s.length();i++)
        {
           if(frq1[s.charAt(i)]!=frq2[t.charAt(i)])
                 return false;
            frq1[s.charAt(i)] = i+1;
            frq2[t.charAt(i)] = i+1;

        }
        return true;
    }
}