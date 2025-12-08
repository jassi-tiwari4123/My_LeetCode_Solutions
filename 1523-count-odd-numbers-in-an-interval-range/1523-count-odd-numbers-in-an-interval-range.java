class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int number=high-low+1;
        count=number/2;
        if(low%2!=0 && high%2!=0){
            count++;
        }
        return count;
    }
}