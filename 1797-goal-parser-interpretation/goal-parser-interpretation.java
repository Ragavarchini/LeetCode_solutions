class Solution {
    public String interpret(String command) {
     String op = command.replace("()","o");
    String ot="";
    char ch[] = op.toCharArray();
    for(int i=0;i<ch.length;i++){
        if(ch[i]=='('||ch[i]==')')
         continue;
        else
         ot+=ch[i];
    } 
    return ot;      
    }
}