class Solution {
    public int findCenter(int[][] edges) {
        // int a = edges[0][0];
        // int b = edges[0][1];
        // int c = edges[1][0];
        // int d = edges[1][1];

        // if (a==c || a==d) return a;
        // return b;

        //adjacency list
        int n=edges.length+1;
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<=n;i++){
            res.add(new ArrayList<>());
        }
        for (int[] e : edges) {
            int u = e[0];
            int v = e[1];
            res.get(u).add(v);
            res.get(v).add(u);
        }
        for(int i=1;i<=n;i++){
            if(res.get(i).size()==edges.length){
                return i;
            }
        }
        return -1;
    }
}
