class Solution {
    public String largestNumber(int[] nums) {
        int n= nums.length;
       int i=0,j=0;

       for(i=0;i<=n-2;i++){
        for(j=i+1;j<=n-1;j++){
           String a= Integer.toString(nums[i]);
           String b= Integer.toString(nums[j]);
           int s =(a+b).compareTo(b+a);
            if(s<0){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
       }
       
       String s="";
       for(int k=0;k<n;k++){
          s+=Integer.toString(nums[k]);
       }
       if(s.charAt(0)=='0')
         return "0";
       return s;
    }
}