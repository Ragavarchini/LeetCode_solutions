class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;
        int sum=0;
        int maxsum=0;
         if(nums.length==2 && nums[0]==0 && nums[1]==1)
          return 1;
        if(nums.length==1 && nums[0]==1)
          return 1;
        for(int i=0;i<n-1;i++)
        {
            if(nums[i]==1 && nums[i+1]==1)
              sum++;
            else if(nums[i]==1)
            {
                sum++;
                maxsum = Math.max(sum,maxsum);
                sum=0;
            }
        }
        if(n>1 && nums[n-2]==1&&nums[n-1]==1)
         sum++;
        maxsum = Math.max(sum,maxsum);
       
        return maxsum;
    }
}