class Solution {
    public int[] getConcatenation(int[] nums) {
      int arr[] = Arrays.copyOf(nums,nums.length);
      int arr1[] = new int[2*nums.length];
      for(int i=0;i<nums.length;i++){
        arr1[i] = nums[i];
      } 
      for(int i=0;i<arr.length;i++){
        arr1[arr.length+i] =  arr[i];
      }
      return arr1;   
    }
}