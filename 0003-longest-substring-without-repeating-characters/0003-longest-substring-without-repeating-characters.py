class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        # Initialize Variables
        abs_max = 0
        left_pointer = 0
        charSet = set()
        
        # Traverse String
        for right_pointer in range(len(s)):
            while s[right_pointer] in charSet:
                charSet.remove(s[left_pointer])
                left_pointer += 1
            charSet.add(s[right_pointer])
            abs_max = max(abs_max, right_pointer - left_pointer + 1)
            
            
        # Return output
        return abs_max
    
# Lessons:
# Switched to Python3
# Two Sum with set()
# in range(len(s)) doesn't require -1 like Java
# string[index] same as string.charAt(index) in Java
        