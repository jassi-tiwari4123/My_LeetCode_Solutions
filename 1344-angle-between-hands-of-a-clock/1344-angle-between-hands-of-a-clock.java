class Solution {
    public double angleClock(int hour, int minutes) {
        hour%=12;
        double hr=hour*30;
        double min=minutes*6;
        double rest=minutes/2.0;
        double op=Math.abs(hr+rest-min);
        return Math.min(op,360-op);
    }
}