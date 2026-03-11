class Solution {
    class DSU{
        int[] parent;
        int[] size;
        DSU(int n){
            parent=new int[n];
            size=new int[n];
            for(int i=0;i<n;i++){
                parent[i]=i;
                size[i]=1;
            }
        }
        int find(int x){
            if(parent[x]==x) return x;
            return parent[x]=find(parent[x]);
        }
        void union(int x,int y){
            int px=find(x);
            int py=find(y);
            if(px==py) return;
            if(size[px]<size[py]){
                parent[px]=py;
                size[py]+=size[px];
            }
            else{
                parent[py]=px;
                size[px]+=size[py];
            }
        }
    }
    public int minCostConnectPoints(int[][] points) {
        int n=points.length;
        ArrayList<int[]> e=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int c=Math.abs(points[i][0]-points[j][0])+  Math.abs(points[i][1]-points[j][1]);
                e.add(new int[]{c,i,j});
            }
        }
        Collections.sort(e,(a,b)->a[0]-b[0]);
        DSU d=new DSU(n);
        int res=0;
        int nEdges=0;
        for(int[] x:e){
            int cost=x[0];
            int u=x[1];
            int v=x[2];
            if(d.find(u)!=d.find(v)){
                d.union(u,v);
                res+=cost;
                nEdges++;
                if(nEdges==n-1){
                    break;
                }
            }
        }
        return res;
    }
}