class MyCalendar {
    List<int[]> booking;
    public MyCalendar() {
        booking=new ArrayList<>();
    }
    
    public boolean book(int startTime, int endTime) {
        for(int[] book:booking){
            int start=book[0];
            int end=book[1];
            //overlapping condition
            if(startTime<end && endTime>start) return false;
        }
        booking.add(new int[]{startTime,endTime});
        return true;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(startTime,endTime);
 */