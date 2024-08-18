class Solution {
    public int[] productExceptSelf(int[] nums) {
        int arr[] = new int[nums.length];
       int total=1,totalc=1;
       for(int i=0;i<nums.length;i++){
            total*=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
             continue;
            else
             totalc*=nums[i];
        }
        for(int i=0; i<nums.length;i++){
            int t=1;
            if(nums[i]==0){
                for(int j = 0;j<arr.length;j++){
                if(j!=i){
                    t*=nums[j];
                }
                }
                arr[i] = t;
                continue;
             }
            
            arr[i] = total/nums[i];
        } 
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0)
             c++;
        }
        if(c==nums.length){
            return nums;
        }
        return arr;
    }
}