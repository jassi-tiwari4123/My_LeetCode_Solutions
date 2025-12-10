class Solution {
    public int lastStoneWeight(int[] stones) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<stones.length;i++){
            arr.add(stones[i]);
        }
        while(arr.size()>1){
            Collections.sort(arr);
            int y=arr.remove(arr.size()-1);
            int x=arr.remove(arr.size()-1);
            if(y!=x){
                arr.add(y-x);
            }
        }
        return arr.isEmpty()?0:arr.get(0);
    }
}