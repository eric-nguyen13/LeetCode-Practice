class Solution {
    public int maxArea(int[] height) {
        int currentLength = height.length - 1;
        int maxArea = 0;
        int tempArea = 0;
        int leftPointer = 0;
        int rightPointer = height.length - 1;
        
        while(leftPointer < rightPointer) {
            tempArea = Math.min(height[leftPointer], height[rightPointer]) * currentLength;
            maxArea = Math.max(maxArea, tempArea);
            
            if(height[leftPointer] < height[rightPointer]){
                leftPointer++;
            }
            else if(height[leftPointer] > height[rightPointer]){
                rightPointer--;
            }
            else{
                rightPointer--;
            }
            
            currentLength--;
        }
        
        return maxArea;
    }
}