class Solution {
    public void solve(int[] nums,int start,int end,List<List<Integer>> res, Set<List<Integer>> seen)
    {
        if(start==end)
        {
            List<Integer> list = new ArrayList<>(); 
            int i; 
            for(i=0 ; i<=nums.length-1 ; i++)
            {
                list.add(nums[i]);
            }
            if (!seen.contains(list)) {
                res.add(new ArrayList<>(list));
                seen.add(list);
            }
            return;
        }
        else 
        { // start = 0 
            for(int i=start ;  i<=end ; i++)
            { // i = 0
               int temp = nums[i]; 
               nums[i]  = nums[start]; 
               nums[start] = temp; 
               solve(nums,start+1,end,res,seen); 
               temp = nums[i]; 
               nums[i]  = nums[start]; 
               nums[start] = temp;
            }
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> res = new ArrayList<>(); 
        Set<List<Integer>> seen = new HashSet<>();
        solve(nums,0,nums.length-1,res,seen);  
        return res;
    }
}