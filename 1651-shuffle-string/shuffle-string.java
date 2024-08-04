class Solution {
    public String restoreString(String s, int[] indices) {
      char arr[]= new char[s.length()];
    int k=0;
    for(int i=0;i<=indices.length-1;i++){
      arr[indices[i]]= s.charAt(k++);
    }  
    return String.valueOf(arr);  
    }
}