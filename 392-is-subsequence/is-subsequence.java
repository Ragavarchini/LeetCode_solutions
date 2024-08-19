class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {
            return true;
        }
        char ch[] = s.toCharArray();
        char ch1[]= t.toCharArray();
        int j=0;
        for(int i=0;i<ch1.length;i++)
        {
            if(j!=s.length()){
            if(ch1[i]==ch[j])
            {
              ch1[i] ='.';
              j++;
            }
            }
        }
        int c=0;
        for(int i=0;i<ch1.length;i++)
        {
            if(ch1[i] =='.')
              c++;
        }
        if(c==s.length())
         return true;
        else
         return false;
    }
}