class Solution {
    public String reverseVowels(String s) {
       String s1 = s.replaceAll("[AEIOUaeiou]","*");
       String s2 = s.replaceAll("[^AEIOUaeiou]","");
       String sb = new StringBuilder(s2).reverse().toString(); 
       int j=0;
       char ch[] = s1.toCharArray();
       for(int i=0;i<ch.length;i++)
       {
        if(ch[i]=='*')
          {
            ch[i] = sb.charAt(j);
            j++;
          }
       }
       String s3="";
       for(int i=0;i<s1.length();i++)
        s3+=ch[i];
       return s3;
    }
}