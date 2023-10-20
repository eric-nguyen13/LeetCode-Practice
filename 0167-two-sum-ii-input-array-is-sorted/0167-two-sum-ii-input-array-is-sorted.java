class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        int[] ret = new int[2];
        
        while(left < right){
            if(numbers[left] + numbers[right] > target){
                right--;
            }
            else if(numbers[left] + numbers[right] < target){
                left++;
            }
            else{
                ret[0] = left + 1;
                ret[1] = right + 1;
                break;
            }
        }
        return ret;
    }
}