class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         HashMap<Integer, Integer> hm = new HashMap<>();
         for(int c : arr)
         {
            if(hm.containsKey(c))
            {
                hm.put(c, hm.get(c)+1);
            }
            else
            {
                hm.put(c,1);
            }
         }
           // Collect occurrences into a list
        List<Integer> list = new ArrayList<>(hm.values());
        
        // Use a set to track unique occurrence counts
        Set<Integer> set = new HashSet<>(list);
        
        // If the size of the set is the same as the list, all counts are unique
        return set.size() == list.size();
    }
}