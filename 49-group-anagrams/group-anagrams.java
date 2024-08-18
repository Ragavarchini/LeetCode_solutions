class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        String arr[] = new String[strs.length];
       int k=0;
       while(k<strs.length)
       {
        char ch[] = strs[k].toCharArray();
        Arrays.sort(ch);
        String s="";
        for(int c=0;c<ch.length;c++){
           s+=ch[c];
        }
        arr[k++] = s;
       }
        int i,j;
        for(i=0;i<arr.length;i++){
            List<String> list = new ArrayList();
            if(arr[i]!="*"){
              list.add(strs[i]);
            for(j=i+1;j<arr.length;j++){
                if(arr[j].equals(arr[i]))
                {
                  list.add(strs[j]);
                  arr[j]="*";
                }
                }
            
            }
            if(!list.isEmpty()){
            res.add((list));
            }
        }
        return res;
    }
}