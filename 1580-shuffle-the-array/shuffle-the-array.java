class Solution {
    public int[] shuffle(int[] nums, int n) {
       int[] firstIndex = Arrays.copyOfRange(nums,0,n);
     int[] secondIndex = Arrays.copyOfRange(nums,n,nums.length) ;  
     int[] arr =  new int[nums.length];
     int k=0;
     for(int i=0;i<n;i++){
        arr[k]= firstIndex[i];
      k++;
        arr[k]= secondIndex[i];
     k++;
     }  
     return arr; 
    }
}