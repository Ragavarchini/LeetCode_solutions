class Solution {
    public int balancedStringSplit(String s) {
      int count =0;
        int b=0;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i)=='L'){
               b++;
              } else{
               b--;}
               if(b==0){
                count++;
               }
        }
       return count;   
    }
}