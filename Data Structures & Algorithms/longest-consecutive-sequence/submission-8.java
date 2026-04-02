class Solution {
    public int longestConsecutive(int[] nums) {
        int current = 1;
        int largest = 1;
        Arrays.sort(nums);
        if(nums.length == 0) {
            return 0;
        }
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == nums[i-1]) {
                continue;
            } else if(nums[i] == nums[i-1] + 1) {
                current++;
            } else {
                current = 1;
            }
            largest = Math.max(current, largest);
        }
        return largest;
    }
}
