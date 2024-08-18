class Solution {
    public int maxArea(int[] height) {
      int l = 0;
      int r= height.length-1;
      int maxArea=0;
     while(l<r){
        int h = Math.min(height[r],height[l]);
        int w = r-l;
        int area = h*w;
        maxArea = Math.max(area,maxArea);
        if(height[l]<height[r])
        {
            l++;
        }
        else
        {
            r--;
        } 
     }
     return maxArea;
    }
}