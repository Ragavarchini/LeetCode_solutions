class Solution {
    public int maxPower(String s) {
       int max=0;
       
       char ch[] = s.toCharArray();
       for(int i=0;i<ch.length;i++){
        int c=1;
        for(int j=i+1;j<ch.length;j++){
            if(ch[i]==ch[j]){
                c++;
            }
            else{
                break;
            }
            
        }
        max=Math.max(c,max);
       } 
       return max;
    }
}