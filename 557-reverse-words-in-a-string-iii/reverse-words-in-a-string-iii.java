class Solution {
    public String reverseWords(String s) {
        String words[] = s.split(" ");
        char ch[];
        String s1="";
        for(int i=0;i<words.length;i++){
            ch = words[i].toCharArray();
            for(int j=ch.length-1;j>=0;j--){
                s1+=ch[j];
            }
            s1+=" ";
        }
        return s1.trim();
    }
}