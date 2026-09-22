class Solution {
    public int nearestDrone(int[][] drones, int[] target) {
        int res=-1;
        int dist=Integer.MAX_VALUE;
        int n=drones.length;
        int X=target[0];
        int Y=target[1];
        for(int i=0;i<n;i++){
            int[] arr=drones[i];
            int x=arr[0];
            int y=arr[1];
            int range=arr[2];
            int dist1=Math.abs(x-X)+Math.abs(y-Y);
            if(dist1<=range && dist1<dist) {
                dist=dist1;
                res=i;
            }
        }
        return res;
    }
}