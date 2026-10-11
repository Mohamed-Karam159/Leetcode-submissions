class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> max = new HashMap<>();
        for(int num: nums){
                max.put(num, max.getOrDefault(num, 0) + 1);
        }
    Map.Entry<Integer, Integer> maxVal = Collections.max(max.entrySet(), Map.Entry.comparingByValue());

                    return maxVal.getKey();
    }
}