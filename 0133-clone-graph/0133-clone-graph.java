/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node, Node> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        visited.put(node, new Node(node.val, new ArrayList<>()));
        q.add(node);
        while(!q.isEmpty()){
            Node curr = q.poll();
            for(Node x : curr.neighbors){
                if(!visited.containsKey(x)){
                    visited.put(x, new Node(x.val, new ArrayList<>()));
                    q.add(x);
                }
                visited.get(curr).neighbors.add(visited.get(x));
            }

        }
        return visited.get(node);
    }
}