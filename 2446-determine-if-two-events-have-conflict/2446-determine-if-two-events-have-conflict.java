class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start1=minutes(event1[0]);
        int end1=minutes(event1[1]);
        int start2=minutes(event2[0]);
        int end2=minutes(event2[1]);
        return !((end1<start2) || (end2<start1));

    }
    public int minutes(String event1){
        int hrs=Integer.parseInt(event1.substring(0,2))*60;
        int min=Integer.parseInt(event1.substring(3,5)); 
        int total=hrs+min;
        return total;
    }
}