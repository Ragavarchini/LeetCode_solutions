class Solution {
    public String longestPalindrome(String s) {
        String str="";
          for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
              String s1=s.substring(i,j);
              if((pali(s1)).length()>str.length()) 
                str=s1;

            }
       
        }
        return str;
    }
        public static String pali(String s){
              int i=0;int j=s.length()-1;
              while(i!=j&&i!=j+1){
                if(s.charAt(i)!=s.charAt(j)) return "";
                i++;
                j--;
                
              }
              return s;

        }
    
}
