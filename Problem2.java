//Climbing Stairs Problem

Time Complexity: O(n)
Space Complexity: O(n)
Approach: Idea is to use result from 2 previos elements and return all n-1 result for total number of ways

class Solution {
    public int climbStairs(int n) {
        int count = 0;
        
        int[] dp = new int[n+1];
        dp[0] = 1;  //n==1
        dp[1] = 2;  //n==2
        for(int i = 2 ; i < n ; i++ ){
            dp[i] = dp[i-1] + dp[i-2];
        }
        
        return dp[n-1];
    }
}
