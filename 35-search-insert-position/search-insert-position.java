class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            if(target <nums[0])
              return 0;
            if(nums[i]==target)
            {
           return i;
            }
            else
            {
                for(int j=0;j<nums.length-1;j++)
                {
                   if(nums[j]< target && nums[j+1]>target)
                      return j+1;
                }
            }
        }
      return nums.length; 

    }
}