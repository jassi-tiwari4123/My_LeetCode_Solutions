class Solution {
    public int maxPoints(int[][] points) {
        //brute eq of line passing through two points
        // (y2-y1)=((y2-y1)/(x2-x2))*(x2-x1);
        // int n=points.length;
        // if(n<=2) return n;
        // int res=2;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         int count=2;
        //         int[] p1=points[i];
        //         int[] p2=points[j];
        //         for(int k=0;k<n;k++){
        //             int[] p3=points[k];
        //             if(k!=i && k!=j){
        //                 if((long)(p2[1]-p1[1])*(p3[0]-p1[0])==(long)(p3[1]-p1[1])*(p2[0]-p1[0])){
        //                     count++;
        //                 }
        //             }
        //         }
        //         res=Math.max(res,count);
        //     }
        // }
        // return res;



        //optimal using tan^-1
        //tan inverse in java Math.atan(1);
        // radian to degree--> Math.toDegrees() vice verse Math.toRadians()
        int n=points.length;
        if(n<2) return n;
        int res=2;
        for(int i=0;i<n;i++){
            HashMap<Double,Integer> hm=new HashMap<>();
            for(int j=0;j<n;j++){
                if(i!=j){
                    double deg=Math.toDegrees(Math.atan2(points[j][1]-points[i][1],points[j][0]-points[i][0]));
                    hm.put(deg,hm.getOrDefault(deg,0)+1);
                    res=Math.max(res,hm.get(deg)+1);
                }
            }
        }
        return res;
    }
}