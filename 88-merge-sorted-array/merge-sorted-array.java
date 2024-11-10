class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[] = new int[m];
        for(int i=0;i<nums1.length;i++)
        {
            if(nums1[i]!=0)
            {
                arr[i] = nums1[i];
            }
        }
        int arr1[] = new int[n];
        for(int i=0;i<nums2.length;i++)
        {
            if(nums2[i]!=0)
            {
                arr1[i] = nums2[i];
            }
        }
        System.arraycopy(arr,0,nums1,0,m);
        System.arraycopy(arr1,0,nums1,m,n);
        Arrays.sort(nums1);
    }
}