class Solution {
    public boolean canFinish(int nc, int[][] prerequisites) {
        //going to do topological sorting apporach, ek indgree to store karwayenge and then 
        ArrayList<Integer>[] g = new ArrayList[nc];
        for(int i =0; i<nc; i++){
            g[i] = new ArrayList<>();
        }
        int[] indeg = new int[nc];
        for(int [] edge: prerequisites){
            int course = edge[0];
            int prerequisite = edge[1];
            g[prerequisite].add(course);
            indeg[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
            for(int i=0; i<nc; i++){
                if(indeg[i]==0){
                    q.add(i);
                }
            }
            int count = 0;
            while(!q.isEmpty()){
                int current = q.remove();
                count++;
                for(int nebar:g[current]){
                    indeg[nebar]--;
                    if(indeg[nebar]==0){
                        q.add(nebar);
                    }
                }
            }
            return count == nc;
    }
}