class Solution {
    public boolean checkOverlap(int radius, int xC, int yC, int x1, int y1, int x2, int y2) {
        //agar nearest point of centre of circle ka distance bada hua radius se toh no overlapping
        //less than radius then inner of circle
        //equal to radius toh bhi true
        //ab nearest point kaise nikale: 
        //horizontal distance:rect on right toh xc<x1 and rect on left toh xc>x2 else xc
        //vertical distance:rect on top toh yc<y1 and rect on bottom toh yc>y2 else yc

        //nearest point
        int hor=xC;
        int ver=yC;
        if(xC<x1) hor=x1;
        if(xC>x2) hor=x2;
        if(yC<y1) ver=y1;
        if(yC>y2) ver=y2;
        return (radius*radius)>=(ver-yC)*(ver-yC)+(hor-xC)*(hor-xC);

    }
}