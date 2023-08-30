class Solution:
    def trap(self, height: List[int]) -> int:
        # Initialize Variables
        l, r = 0, len(height) - 1
        leftMax, rightMax = height[l], height[r]
        ret = 0
        
        # Traverse list
        while(l < r):
            if(leftMax < rightMax):
                l += 1
                leftMax = max(height[l], leftMax)
                ret += leftMax - height[l]
            else:
                r -= 1
                rightMax = max(height[r], rightMax)
                ret += rightMax - height[r]
                
                
        # Return output
        return ret
        
        
# Lesson:
# -  Switched to Python
# - height.length - 1 ==> len(height) - 1
# - l++ ==> l += 1
            
        