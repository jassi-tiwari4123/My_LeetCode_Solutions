class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int i=0;
        int n=gas.length;
        int a=0,total=0,capacity=0;
        while(i<n){
            total+=(gas[i]-cost[i]);
            capacity+=(gas[i]-cost[i]);
            if(capacity<0){
                a=i+1;
                capacity=0;
            }
            i++;

        }
        return total<0?-1:a;
    }
}