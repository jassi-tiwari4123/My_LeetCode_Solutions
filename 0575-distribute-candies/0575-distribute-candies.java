class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        int eat=n/2;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(candyType[i],hm.getOrDefault(candyType[i],0)+1);
        }
        int size=hm.size();
        if(eat>size) return size;
        if(eat==size) return size;
        return eat;
    }
}