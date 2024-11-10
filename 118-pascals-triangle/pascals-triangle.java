class Solution {
    public List<List<Integer>> generate(int numRows) {
       List<List<Integer>> ls = new ArrayList<>();
        for(int i=1;i<=numRows;i++)
		{
		    int d=1;
            List<Integer> ls1 = new ArrayList<Integer>();
		    for(int j=1;j<=i;j++)
		    {

		        ls1.add(d);
		        d = d*(i-j)/j;
		    }
		   ls.add(ls1);
		}
        return ls;
    }
}