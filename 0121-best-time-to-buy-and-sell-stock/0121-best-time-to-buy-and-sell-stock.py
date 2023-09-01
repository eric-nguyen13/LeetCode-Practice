class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        
        minimum = prices[0]
        for price in prices:
            if price < minimum:
                minimum = price
            profit = max(profit, price - minimum)
            
        return profit