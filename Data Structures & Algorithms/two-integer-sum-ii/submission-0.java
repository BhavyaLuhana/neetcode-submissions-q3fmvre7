class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int right = numbers.length - 1;
        int left = 0;
        int[] result = new int[2];

        while(left < right) {
            int currSum = numbers[left] + numbers[right];

            if(currSum > target) {
                right--;
            } else if(currSum < target) {
                left++;
            } else {
                result[0] = left+1;
                result[1] = right+1;
                return result;
            }
        }
        return new int[] {-1, -1};
    }
}
