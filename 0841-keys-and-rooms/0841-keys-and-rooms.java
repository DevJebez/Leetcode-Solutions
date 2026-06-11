class Solution {
    public boolean bfs(int node,boolean[] visited, List<List<Integer>> rooms){
        Queue<Integer> q = new LinkedList<>();
        visited[node] = true;
        q.add(node);
        //int count = 0;
        while(!q.isEmpty()){
            int current = q.poll();
            for(int i : rooms.get(current)){
                if(visited[i] == false){
                    visited[i] = true;
                    q.add(i);
                    //count++;
                }
            }
        }
        boolean ans = true;
        for(boolean x : visited){
            ans = x & ans;
        }
        return ans;
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int v = rooms.size();
        boolean[] visited = new boolean[v];
        //visitedCount = bfs(0, visited, rooms);
        return bfs(0, visited, rooms);
    }
}