class Solution {
    public boolean isAcronym(List<String> words, String s) {
        
        int k=0;
        int flag=0;
        if(words.size()!=s.length()){
            return false;
        }
        else{
       for(int i=0;i<words.size();i++){
        if(words.get(i).charAt(0) == s.charAt(k)){
            k++;
        }
       }
       if(k==words.size()) 
       return true;
       else
       return false;
        }
    }
}