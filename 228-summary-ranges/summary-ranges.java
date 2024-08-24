class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<>();
        if(nums.length==0)
            return list;
        String s="";
        int st=nums[0];
        int end=nums[0];
       // s=Integer.toString(nums[0]);
        for(int i=1;i<nums.length;i++)
        { 
        //     if(i==nums.length)
        //     {  
                
        //         if(nums[i-1]==(nums[i-2]+1))
        //         {
        //             System.out.print("here");
        //             s+=Integer.toString(nums[i-2]);
        //             s+="->";
        //             s+=Integer.toString(nums[i-1]);
        //             list.add(s);
        //             break;
        //         }
        //         else 
        //         {
        //             s+=Integer.toString(nums[i-1]);
        //             list.add(s);
        //             break;
        //         }
        //    }
            if(nums[i] == nums[i-1]+1)
            {
                //s+=Integer.toString(nums[i]);
                end=nums[i];
            }
            else//mismatch
            {
                
                if(st==end)
                {
                    list.add(Integer.toString(st));
                }
                else
                {
                    s="";
                    s= Integer.toString(st)+"->"+Integer.toString(end);
                     list.add(s);
                }
                st=end=nums[i];
            }
        }
        if(st==end)
                {
                    list.add(Integer.toString(st));
                }
                else
                {
                    s="";
                    s= Integer.toString(st)+"->"+Integer.toString(end);
                     list.add(s);
                }
        return list;
    }
}