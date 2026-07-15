class Solution {
    public boolean judgeSquareSum(int c) {
        int root=(int) Math.sqrt(c);
        int low=0;
        int high=root;
        while(low<=high){
            if((1L*low*low)+(1L*high*high)==c){
                return true;
            }
            else if((1L*low*low)+(1L*high*high)<c){
                low++;
            }
            else{
                high--;
            }
        }
        return false;
    }
}