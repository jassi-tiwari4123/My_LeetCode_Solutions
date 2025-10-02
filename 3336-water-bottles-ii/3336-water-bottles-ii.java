class Solution {
    public int maxBottlesDrunk(int numBottles, int numExchange) {
        int totalDrunk=numBottles;
        int empty=numBottles;
        
        while(empty>=numExchange){
            empty-=numExchange;
            totalDrunk++;
            empty++;
            numExchange++;
        }
        return totalDrunk;
    }
}