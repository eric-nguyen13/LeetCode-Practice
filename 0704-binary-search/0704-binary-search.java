class Solution {
    public int search(int[] nums, int target) {
        int leftPointer = 0;
        int middlePointer = nums.length / 2;
        int rightPointer = nums.length - 1;
        
        while(leftPointer <= rightPointer){
            middlePointer = leftPointer + (rightPointer - leftPointer) / 2;
            if(target == nums[middlePointer]){
                return middlePointer;
            }
            else if(target < nums[middlePointer]){
                rightPointer = middlePointer - 1;
            }
            else{
                leftPointer = middlePointer + 1;
            }
        }
        
        return -1;
    }
}