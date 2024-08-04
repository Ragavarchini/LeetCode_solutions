class Solution {
    public int minimumOperations(int[] nums) {
        int rem=0,op=0;
       for(int i=0;i<nums.length;i++){
          rem = nums[i]%3;
          if(rem!=0)
            op++;
       
        }
        return op;
       } 
    }
