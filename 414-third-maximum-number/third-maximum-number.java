class Solution {
    public int thirdMax(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int i=0;i<nums.length;i++)
       {
        set.add(nums[i]);
       } 
       List<Integer> ls = new ArrayList<>(set);
       Collections.sort(ls,Collections.reverseOrder());
       if(ls.size()>=3)
       {
         return ls.get(2);
       }
       return ls.get(0);
    }
}