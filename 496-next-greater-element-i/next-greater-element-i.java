class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n[] = new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
        {
            int j=0,k=nums2.length-1;
            int next =-1;
            while(j<k)
            {
                if(nums2[k]==nums1[i])
                {
                   // if(next==-1)
                     break;
                }
                if(nums2[k]>nums1[i])
                 next = nums2[k];
                 k--;
            }
            n[i] = next;
        }
        return n;
    }
}