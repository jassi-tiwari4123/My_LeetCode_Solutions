class Solution {
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        //4 eq sides and 2 eq diagonals
        int[] sides={len(p1,p2),len(p1,p3),len(p1,p4),len(p2,p3),len(p2,p4),len(p3,p4)};
        // int s1=Math.abs((p2[0]-p1[0])+(p2[1]-p1[1]));
        // int s2=Math.abs((p3[0]-p2[0])+(p3[1]-p2[1]));
        // int s3=Math.abs((p4[0]-p3[0])+(p4[1]-p3[1]));
        // int s4=Math.abs((p1[0]-p4[0])+(p1[1]-p4[1]));
        // int s5=Math.abs((p1[0]-p3[0])+(p1[1]-p3[1]));
        // int s6=Math.abs((p2[0]-p4[0])+(p2[1]-p4[1]));
        Arrays.sort(sides);
        return sides[0]>0 && sides[0]==sides[1] && sides[1]==sides[2] && sides[2]==sides[3] && sides[4]==sides[5]; 
        
    }
    public int len(int[] a,int[] b){
        return Math.abs(((a[0]-b[0])*(a[0]-b[0]))+(a[1]-b[1])*(a[1]-b[1]));
    }
}