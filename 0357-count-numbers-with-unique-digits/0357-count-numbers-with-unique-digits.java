class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        //using normal permutaion
        if(n==0) return 1;
        //agar n==1 mean 0 to 10 : 10 excluded
        int num=10;
        int unitPlace=9; //0 nhi daal sakte in the beginning 
        int remaining=9; // ek use ho gya vo ab vaapis use nhi kar sakte toh we still have 9 options (0-9 excluding the one used in front of the number)
        for(int i=2;i<=n && remaining>0;i++){
            unitPlace=unitPlace*remaining;
            num+=unitPlace;
            remaining--;
        }
        return num;
    }
}