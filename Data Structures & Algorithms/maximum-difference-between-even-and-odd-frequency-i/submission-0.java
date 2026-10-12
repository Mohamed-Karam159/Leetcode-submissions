class Solution {
    public int maxDifference(String s) {
        Map<Character, Integer> maxDiff = new HashMap<>();

        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;

        for(char c : s.toCharArray()){
            maxDiff.put(c, maxDiff.getOrDefault(c, 0) + 1);
        }
        for(int freq: maxDiff.values()){
            if(freq % 2 == 0)
                minValue = minValue < freq ? minValue : freq;
            else 
                maxValue = maxValue > freq ? maxValue : freq;

        }
        return maxValue - minValue ;
    }
}