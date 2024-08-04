class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
      StringBuilder sb1 = new StringBuilder();
    for(String s : word1){
        sb1.append(s);
    }
     String a=sb1.toString();
     StringBuilder sb2 = new StringBuilder();
     for(String s : word2){
        sb2.append(s);
    }
     String b=sb2.toString();
     return a.equals(b);  
    }
}