class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        int p2;

        for(int i = 0; i < nums.length; i++) {
            if(i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int p1 = i + 1;
            p2 = nums.length - 1;

            while(p1 < p2) {

                if(nums[p1] + nums[p2] > -nums[i]) {
                    p2--;
                } 
                else if(nums[p1] + nums[p2] < -nums[i]) {
                    p1++;
                } 
                else {
                    ArrayList<Integer> list = new ArrayList<>();

                    list.add(nums[i]);
                    list.add(nums[p1]);
                    list.add(nums[p2]);

                    result.add(list);

                    while(p1 < p2 && nums[p1] == nums[p1+1]) {
                        p1++;
                    }
                    while(p1 < p2 && nums[p2] == nums[p2-1]) {
                        p2--;
                    }

                    p1++;
                    p2--;
                }
            }
        }
        return result;
    }
}
