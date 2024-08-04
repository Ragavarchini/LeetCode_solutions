class Solution {
    public boolean checkIfPangram(String sentence) {
       int c=0;
       char ch[] = sentence.toCharArray();
       for(int i=0;i<ch.length;i++){
        for(int j=i+1;j<ch.length;j++){
            if(ch[i]==ch[j]){
               ch[j]='0';
            }
            }
        }
        for(int i=0;i<ch.length;i++){
            if(ch[i]!='0')
            c++;
        }     
       if(c==26)
            return true;
        else
            return false;
        
       } 
    }
