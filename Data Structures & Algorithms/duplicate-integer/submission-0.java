class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> uniqueElements = new HashSet<>();
        for(int num : nums){
            if(!uniqueElements.add(num))
                return true;
        }
        return false;
    }
}