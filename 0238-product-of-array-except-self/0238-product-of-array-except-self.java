class Solution {
    public int[] productExceptSelf(int[] nums) {

        // Initialize Variables
        int[] output = new int[nums.length];

        // Traverse starting from the left
        output[0] = 1;
        for(int i = 1; i < nums.length; i++){
            output[i] = output[i-1] * nums[i-1];
        }

        // Traverse starting from the right
        int k = 1;
        for(int i = nums.length - 2; i >= 0; i--){
            k *= nums[i+1];
            output[i] = output[i] * k;
        }

        // Return
        return output;
    }
}
