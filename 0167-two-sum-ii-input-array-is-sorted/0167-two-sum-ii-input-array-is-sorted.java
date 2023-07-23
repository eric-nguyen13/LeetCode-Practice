class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // Initialize Variables - Constant space
        int leftPointer = 0;
        int rightPointer = numbers.length - 1;
        int[] ret = new int[2];

        // Traverse Array and move pointers accordingly - Linear time complexity
        while(numbers[leftPointer] + numbers[rightPointer] != target){
            if(numbers[leftPointer] + numbers[rightPointer] > target){
                rightPointer--;
            } else if(numbers[leftPointer] + numbers[rightPointer] < target){
                leftPointer++;
            }
        }

        // Return
        return new int[]{leftPointer + 1, rightPointer + 1};
        
    }
}

// Solved it with Two Sum I originally. Optimized with YouTube. Leverage sorted list and pointers