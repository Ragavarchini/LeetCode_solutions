class Solution {
    public int findPoisonedDuration(int[] t, int d) {
        int n = t.length;
        Set<Integer> set = new HashSet<>();
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
           if(t[i+1]< t[i]+d)
           {
             sum+=t[i+1]-t[i];
           }
           else
            sum+=d;
        }
        sum+=d;
        return sum;
    }
}