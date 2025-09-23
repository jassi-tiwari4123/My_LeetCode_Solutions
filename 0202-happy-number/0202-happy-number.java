class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> visit=new HashSet<>();
        while(n!=1 && !visit.contains(n)){
            visit.add(n);
            n=newN(n);
        }
        if(n==1){
            return true;
        }
        else{
            return false;
        }
    }
    public static int newN(int n){
        int sq=0;
        while(n>0){
            int nn=n%10;
            sq+=nn*nn;
            n=n/10;
        }
        return sq;
    }
}