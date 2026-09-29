class Solution {
    public int[] getConcatenation(int[] nums) {
        int numsLength = nums.length;
      int ans[]= new int[numsLength + numsLength];
      for(int i = 0; i < numsLength; i++){
        ans[i] = ans[ i + numsLength ]= nums[i];
      }
      return ans;
    }
}