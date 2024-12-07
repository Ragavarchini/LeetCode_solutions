class Solution {
    public int rob(int[] nums) {
          if (nums == null || nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        // Initialize two variables to track the previous two states
        int prev2 = 0; // Max profit if the house two steps back is considered
        int prev1 = 0; // Max profit if the house one step back is considered

        for (int num : nums) {
            int current = Math.max(prev1, prev2 + num); // Choose max between robbing current house or skipping
            prev2 = prev1; // Update prev2 to the previous prev1
            prev1 = current; // Update prev1 to the current max profit
        }

        return prev1;
    }
}