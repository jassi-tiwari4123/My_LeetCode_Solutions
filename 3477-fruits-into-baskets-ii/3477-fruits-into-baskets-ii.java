class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        // int n=fruits.length;
        // ArrayList<Integer> b=new ArrayList<>();
        // for(int i=0;i<n;i++){
        //     b.add(baskets[i]);
        // }
        // int res=0;
        
        // for(int i=0;i<n;i++){
        //     int fruit=fruits[i];
        //     boolean place=false;
        //     for(int j=0;j<b.size();j++){
        //         if(fruit<=b.get(j)){
        //             place=true;
        //             b.remove(j);
        //             break;
        //         }
        //     }
        //     if(!place){
        //         res++;
        //     }
        // }
        // return res;



        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(baskets[j]>=fruits[i]){
                    baskets[j]=-1;
                    break;
                }
            }
        }
        int res=0;
        for(int i=0;i<baskets.length;i++){
            if(baskets[i]!=-1){
                res++;
            }
        }
        return res;
    }
}