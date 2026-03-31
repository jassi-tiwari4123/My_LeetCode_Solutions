class Solution {
    public long pickGifts(int[] gifts, int k) {
        //my approach
        // int n=gifts.length;
        // Arrays.sort(gifts);
        // while(k-->0){
        //     int idx=0;
        //     for(int i=1;i<n;i++){
        //         if(gifts[i]>gifts[idx]){
        //             idx=i;
        //         }
        //     }
        //     gifts[idx]=(int)Math.sqrt(gifts[idx]);
        // }
        // long sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=gifts[i];
        // }
        // return sum;


        //can use priority queue as well for top k elements
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<gifts.length;i++){
            pq.add(gifts[i]);
        }

        while(k-->0){
            int x=pq.poll();
            int sq=(int)Math.sqrt(x);
            pq.add(sq);
        }
        long res=0;
        while(!pq.isEmpty()){
            res+=pq.poll();
        }
        return res;
    }
}