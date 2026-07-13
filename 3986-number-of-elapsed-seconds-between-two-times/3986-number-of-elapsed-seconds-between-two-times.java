class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        String[] arr1=startTime.split(":");
        String[] arr2=endTime.split(":");
        int secEnd=Integer.parseInt(arr2[0])*3600+Integer.parseInt(arr2[1])*60+Integer.parseInt(arr2[2]);
        int secSrt=Integer.parseInt(arr1[0])*3600+Integer.parseInt(arr1[1])*60+Integer.parseInt(arr1[2]);
        if(secEnd<secSrt) {
            secEnd+=24*3600;
        }
        return secEnd-secSrt;
    }
}