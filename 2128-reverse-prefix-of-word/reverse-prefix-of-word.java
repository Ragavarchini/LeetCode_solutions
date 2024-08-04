class Solution {
    public String reversePrefix(String word, char ch) {
       String rev="";
     if(word.indexOf(ch)>0)
       {
        for(int i=word.indexOf(ch);i>=0;i--){
          rev+=word.charAt(i);  
        }
        //int a = Math.abs(0-word.indexOf(ch));
        for(int i=word.indexOf(ch)+1;i<word.length();i++){
            rev+=word.charAt(i);
        }
        return rev;
       }
       else
       {
        return word;
       }  
    }
}