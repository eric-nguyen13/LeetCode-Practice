class Solution {
    public int longestConsecutive(int[] nums) {        
        // Initialize Variables
        Set<Integer> numSet = new HashSet<>();
        int tempMax = 0;
        int retOutput = 0;
        
        // Traverse nums to add into numSet
        for(int num : nums){
            numSet.add(num);
        }
        
        // Traverse nums to find longest sequence
        for(int num : nums){
            if(!numSet.contains(num - 1)){ // This filters the amount of while loops ran
                tempMax = 1;
                while(numSet.contains(num + 1)){
                    tempMax++;
                    num++;
                }
                retOutput = Math.max(tempMax, retOutput);
                
            }
        }
        
        // Return
        return retOutput;
        
    }
} // Time Complexity: Constant * O(n) => 2O(n)
