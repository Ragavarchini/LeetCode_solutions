class Solution {
    public int majorityElement(int[] nums) {
        if(nums.length==1)
          return nums[0];
       Arrays.sort(nums);
        int i,max=1,c=1,maxi=0;
        for(i=0;i<nums.length-1;i++)
        {
            if(nums[i] == nums[i+1])
            {
                c++;
            }
            else
            {
                if(max<c)
                {
                    max = c;
                    maxi =i;
                }
                else
                {
                    max = max;
                    if(i==0){  
                     maxi = i;
                    }
                    else{
                    maxi=i-max;
                    }
                }
                c=1;
                continue;
            }
        }
         if(max<c)
                {
                    max = c;
                    return nums[i];
                }
                else
                {
                    max = max;
                    return nums[maxi];
                }
            
    }
}