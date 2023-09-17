class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // Initialize Variables
        int[] dp = new int[cost.length];
        
        // Hardcode the last two prices
        dp[dp.length - 1] = cost[dp.length - 1];
        dp[dp.length - 2] = cost[dp.length - 2];
        
        // Traverse array
        for(int i = cost.length - 3; i >= 0; i--){
            int oneStep = dp[i + 1];
            int twoStep = dp[i + 2];
            
            if(oneStep < twoStep){
                dp[i] = cost[i] + dp[i + 1];
                System.out.println("one");
            }
            else if(twoStep < oneStep){
                dp[i] = cost[i] + dp[i + 2];
                System.out.println("two");
            }
            else{ // They are equal... figure out between 1 or 2 steps... 2 steps?
                dp[i] = cost[i] + dp[i + 2];
            }
        }
        
        for(int i = 0; i < dp.length; i++){
            System.out.println(dp[i]);
        }
        
        // Return output
        return Math.min(dp[0], dp[1]);
    }
}