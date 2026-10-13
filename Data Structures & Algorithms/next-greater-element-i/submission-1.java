class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // FIX 1: Change '3' to 'nums1.length' so it doesn't crash on larger arrays
        int[] list = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            int nMax = nums1[i];
            
            // FIX 2: Set the default answer to -1 here for this element
            list[i] = -1;
            
            // We create a boolean flag to know when we have found the matching number in nums2
            boolean foundMatch = false;
            
            for (int j = 0; j < nums2.length; j++) {
                
                // Step A: First, we must find where nums1[i] lives in nums2
                if (!foundMatch) {
                    if (nums2[j] == nMax) {
                        foundMatch = true; // We found it! Now we can start looking for a greater number
                    }
                    continue; // Skip until we find the match
                }
                
                // Step B: Now that foundMatch is true, we are strictly looking to the RIGHT
                if (nums2[j] > nMax) {
                    list[i] = nums2[j]; // Found the first greater element!
                    break;              // Stop looking further right
                }
            }
        }
        return list;
    }
}
