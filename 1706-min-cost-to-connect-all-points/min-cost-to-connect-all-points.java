class Solution {

    public int minCostConnectPoints(int[][] points) {

        int n = points.length;

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[0] - b[0]);

        boolean[] v = new boolean[n];

        pq.offer(new int[]{0, 0});

        int tc = 0;
        int c = 0;

        while (c < n) {

            int[] curr = pq.poll();

            int co = curr[0];
            int p = curr[1];

            if (v[p]) {
                continue;
            }

            v[p] = true;
            tc += co;
            c++;

            for (int i = 0; i < n; i++) {

                if (!v[i]) {

                    int d = Math.abs(points[p][0] - points[i][0])
                          + Math.abs(points[p][1] - points[i][1]);

                    pq.offer(new int[]{d, i});
                }
            }
        }

        return tc;
    }
}