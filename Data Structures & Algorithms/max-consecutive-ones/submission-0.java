class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, count = 0;
        for(int num : nums){
            if(num == 1)
                count++;
            else
                  count = 0;
             if(max < count) 
                        max = count;
                
        }
        return max;
    }
}