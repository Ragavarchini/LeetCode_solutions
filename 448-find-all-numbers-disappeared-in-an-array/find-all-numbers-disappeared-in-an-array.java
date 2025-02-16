class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        List<Integer> ls = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            set.add(nums[i]);
        }
        
        for(int i=1;i<=n;i++)
          {
            if(!set.contains(i))
              ls.add(i);
          }
        return ls;        
    }
}