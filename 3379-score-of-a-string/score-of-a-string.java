class Solution {
    public int scoreOfString(String s) {
        int diff;
        int sum=0;
    char ch[] = s.toCharArray();
    for(int i =0;i<ch.length-1;i++){
        diff= Math.abs(((int)(ch[i])-(int)(ch[i+1])));
        sum+=diff;
    }
    return sum;  
    }
}