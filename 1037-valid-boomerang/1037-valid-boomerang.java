class Solution {
    public boolean isBoomerang(int[][] points) {
        //determinant: area of triangle is 0 then collinear
        double area=0.5*(Math.abs((points[0][0]*(points[1][1]-points[2][1]))+(points[1][0]*
        (points[2][1]-points[0][1]))+(points[2][0]*(points[0][1]-points[1][1]))));
        return area==0?false:true;
    }
}