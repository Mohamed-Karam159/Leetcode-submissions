class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxSum = 0 , currSum = nums[0];
        int curr = nums[0]; // curr = 10
        for(int num : nums){
            if(curr < num){
                currSum += num; // currSum = 65
                curr = num; // curr = 10
            }

            else{
               maxSum = maxSum < currSum ? currSum : maxSum; // maxSum = 60
               currSum = num; // currSum = 5
                curr = num; // curr = 5
            }
        }
        return currSum > maxSum ? currSum : maxSum;
    }
}