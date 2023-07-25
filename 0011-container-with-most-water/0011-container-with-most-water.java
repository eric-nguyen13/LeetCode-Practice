class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        
        while(leftPointer < rightPointer) {
            int tempArea = Math.min(height[leftPointer], height[rightPointer]) * (rightPointer - leftPointer);
            maxArea = Math.max(maxArea, tempArea);
            
            if(height[leftPointer] < height[rightPointer]){
                leftPointer++;
            }
            else{
                rightPointer--;
            }
        }
        
        return maxArea;
    }
}