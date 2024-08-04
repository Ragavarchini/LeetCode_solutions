class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int  temp=0;
      for(int i=0;i<names.length;i++){
        for(int j=0;j<names.length - i -1;j++){
            if(heights[j]<heights[j+1]){
                temp = heights[j];
                heights[j]= heights[j+1];
                heights[j+1] = temp;

               String temp1 = names[j];
                names[j] = names[j+1];
                names[j+1] = temp1;
            }
        }
      }
     return names;
      }  
}
