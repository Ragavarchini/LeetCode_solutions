class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int s1= nums1.length;
        int s2= nums2.length;
        int arr[] = new int[s1+s2];
        //for(int i=0;i<s1+s2;i++)
        System.arraycopy(nums1,0,arr,0,s1);
        System.arraycopy(nums2,0,arr,s1,s2);
        Arrays.sort(arr);int ab;
        if(arr.length%2==0){
            int a = arr.length/2;
            int b = arr[a];
            int c = arr[a-1];
            return (double) (b+c)/2.0;
            
        }
        else
            ab = Math.round(arr.length/2);
           return (double)arr[ab];
    }
}