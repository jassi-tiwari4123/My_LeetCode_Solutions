class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] arr1=startTime.split(":");
        String[] arr2=endTime.split(":");
        int hr2=Integer.parseInt(arr2[0]);
        int min2=Integer.parseInt(arr2[1]);
        int sec2=Integer.parseInt(arr2[2]);
        int secEnd=hr2*3600+min2*60+sec2;
        int hr1=Integer.parseInt(arr1[0]);
        int min1=Integer.parseInt(arr1[1]);
        int sec1=Integer.parseInt(arr1[2]);
        int secStart=hr1*3600+min1*60+sec1;
        return secEnd-secStart;
    }
}