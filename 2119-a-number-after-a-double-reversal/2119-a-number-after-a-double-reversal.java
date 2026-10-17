class Solution {
    public boolean isSameAfterReversals(int num) {
        int x1=reverse(num);
        int x2=reverse(x1);
        return num==x2;
    }
    public int reverse(int num){
        int x=0;
        while(num>0){
            int dig=num%10;
            x=x*10+dig;
            num/=10;
        }
        return x;
    }
}