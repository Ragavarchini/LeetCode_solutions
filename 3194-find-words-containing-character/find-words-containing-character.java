class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ot = new LinkedList<>();
     for(int i=0;i<words.length;i++){
        if(words[i].contains(String.valueOf(x)))
          ot.add(i);
     }  
     return ot; 
    }
}