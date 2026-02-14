class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int n=fruits.length;
        ArrayList<Integer> b=new ArrayList<>();
        for(int i=0;i<n;i++){
            b.add(baskets[i]);
        }
        int res=0;
        
        for(int i=0;i<n;i++){
            int fruit=fruits[i];
            boolean place=false;
            for(int j=0;j<b.size();j++){
                if(fruit<=b.get(j)){
                    place=true;
                    b.remove(j);
                    break;
                }
            }
            if(!place){
                res++;
            }
        }
        return res;
    }
}