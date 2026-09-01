class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] Sorted = new int[n];
        int x = 0;
        for(int i = 0; i<n; i++)
        {
            Sorted[i] = heights[i];
        }
        for(int i =0; i<n;i++)
        {
            for(int j = 0; j<n-1;j++)
            {
                if(heights[j] > heights[j+1]){
                    int temp = heights[j];
                    heights[j] = heights[j+1];
                    heights[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<n; i++)
        {
            if(!(heights[i] == Sorted[i]))
            {
                x++;
            }
        }
        return x;
    }
}