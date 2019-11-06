class Solution {
    public int removeDuplicates(int[] nums) {
        int length = 0;
        for(int i = 1; i < nums.length; i++) {
            if (nums[length] != nums[i]) {
                nums[length + 1] = nums[i];
                length++;
            }
        }
        return length + 1;
    }
}
