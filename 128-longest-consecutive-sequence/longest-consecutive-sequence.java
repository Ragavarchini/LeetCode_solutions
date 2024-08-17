class Solution {
    public int longestConsecutive(int[] nums) {
        int c=1;
        int max=1;
        if(nums.length == 0){
            return 0;
        }
       Arrays.sort(nums);
       for(int i=1;i<nums.length;i++){
          if(nums[i]==nums[i-1]){
            continue;
          }
         if(nums[i] == nums[i-1]+1 )
            {
              c++;
            }
            else
            {
             if(c>max){
                max =c;
                c=1;
             }
             else
             {
                c=1;
             }
            }
       }
       if(c>max){
          return c;
       }
       else{
        return max;
       }
    }
}