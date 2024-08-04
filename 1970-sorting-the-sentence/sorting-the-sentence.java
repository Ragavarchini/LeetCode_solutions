class Solution {
    public String sortSentence(String s) {
        int min=0,len,ch,ch1;
        String temp;
      String words[] = s.split(" ");
     for(int i=0;i<words.length;i++){
        len = words[i].length();
         ch = words[i].charAt(len-1);
        for(int j=i+1;j<words.length;j++){
            len = words[j].length();
             ch1 = words[j].charAt(len-1);
            if(ch1<ch){
                temp = words[i];
                words[i] = words[j];
                words[j] = temp;
                ch = ch1;
            }
        }
            
        }
        for(int i=0;i<words.length;i++){
            words[i] = words[i].substring(0,words[i].length()-1);
        }
        String str ="";
        for(int i=0;i<words.length-1;i++){
            str+=(words[i]+" ");
        }
        str=str+words[words.length-1];
        return str;
     }
    }
