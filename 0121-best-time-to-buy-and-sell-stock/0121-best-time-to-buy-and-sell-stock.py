class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        # Initialize Variables
        profit = 0
        left_pointer = 0 # Temp minimum
        temp_max = prices[0]
        
        # Traverse list
        for right_pointer in range(len(prices)):
            temp_max = max(temp_max, prices[right_pointer])
            
            if prices[right_pointer] < prices[left_pointer]:
                left_pointer = right_pointer
                temp_max = prices[left_pointer]
                
            profit = max(profit, temp_max- prices[left_pointer])
                
                
        # Return output
        return profit
        
# Did by myself
# Lessons: Switched to Python3
# Used sliding door concept where both pointers pointed to indices not the elements themselves