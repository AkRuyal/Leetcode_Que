class Solution {
    public int maxArea(int[] height) {

        int max = 0;
        int min = 0;

        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            if (height[left] > height[right]) {
                min = height[right];
            } else {
                min = height[left];
            }

            if (min * (right - left) > max) {
                max = min * (right - left);
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;
    }
}