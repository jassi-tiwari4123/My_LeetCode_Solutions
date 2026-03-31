class Solution {
    public long pickGifts(int[] gifts, int k) {
        int n=gifts.length;
        Arrays.sort(gifts);
        while(k-->0){
            int idx=0;
            for(int i=1;i<n;i++){
                if(gifts[i]>gifts[idx]){
                    idx=i;
                }
            }
            gifts[idx]=(int)Math.sqrt(gifts[idx]);
        }
        long sum=0;
        for(int i=0;i<n;i++){
            sum+=gifts[i];
        }
        return sum;
    }
}