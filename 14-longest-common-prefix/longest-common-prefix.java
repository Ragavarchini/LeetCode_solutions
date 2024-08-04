class Solution {
    public String longestCommonPrefix(String[] strs) {
     Arrays.sort(strs);
     String str1 = strs[0];
     String str2 = strs[strs.length-1];
     String op = "";
     for(int i=0;i<str1.length();i++){
        if(str1.charAt(i)==str2.charAt(i))
           op+=str1.charAt(i);
        else
           break;
     }
     return op;    
    }
}