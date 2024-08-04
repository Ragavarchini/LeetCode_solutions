class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        
      int c=0; 
      
      for(int i=0;i<words.length;i++){
        int flag =0;
        for (char ch : words[i].toCharArray()) {
        if (allowed.indexOf(ch) == -1) {
           flag =1;
          }
        }
        if(flag!=1)  
          c++;
    }
    return c;
}
}