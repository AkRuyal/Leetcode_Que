class Solution {
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> h = new HashSet<>();

        for (int i : nums) {
            h.add(i);
        }

        int j = 0;

        for (int x : h) {
            nums[j] = x;
            j++;
        }

        Arrays.sort(nums, 0, h.size());

        return h.size();
    }
}