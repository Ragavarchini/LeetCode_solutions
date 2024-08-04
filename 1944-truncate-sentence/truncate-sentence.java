class Solution {
    public String truncateSentence(String s, int k) {
     String op ="";
     String[] words = s.split(" ");
     for(int i =0;i<k;i++){
         op+= words[i];
         if(i<k-1){
            op+=" ";
         }
         
     }
     return op;    
    }
}