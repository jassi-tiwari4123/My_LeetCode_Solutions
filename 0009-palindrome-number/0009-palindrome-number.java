class Solution {
    public boolean isPalindrome(int n) {
        int reverse=0;
        int temp=n;
        while(n!=0){
            int last=n%10;
            reverse=reverse*10+last;
            n/=10;
        }
        if((reverse>=0) && (reverse==temp)){
           return true;
        }
        return false;
    }
}