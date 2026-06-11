class Solution {
    private static boolean bfs(int source, int destination,boolean[] visited, ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q = new LinkedList<>();
        if(source == destination) return true;
        q.add(source);
        visited[source] = true;
        while(!q.isEmpty()){
            int c = q.poll();
            for(int i : adj.get(c)){
                if(visited[i] == false){
                    visited[i] = true;
                    if(i == destination){
                        return true;
                    }
                    q.add(i);
                }
            }
        }
        return false;
    }
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        boolean[] visited = new boolean[n];
        //create adj list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());
        for(int i = 0; i< edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        return bfs(source, destination, visited, adj);
    }
}