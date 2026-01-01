class Solution {
    public int longestSubarray(int[] nums, int limit) {
        int n=nums.length;
        PriorityQueue<int[]> maxHeap=new PriorityQueue<>((a,b)->b[0]-a[0]);
        PriorityQueue<int[]> minHeap=new PriorityQueue<>((a,b)->a[0]-b[0]);
        int i=0;
        int res=0;
        for(int j=0;j<n;j++){
            maxHeap.offer(new int[]{nums[j],j});
            minHeap.offer(new int[]{nums[j],j});
            while(maxHeap.peek()[0]-minHeap.peek()[0]>limit){
                i++;
                while(maxHeap.peek()[1]<i){
                    maxHeap.poll();
                }
                while(minHeap.peek()[1]<i){
                    minHeap.poll();
                }
            }
            res=Math.max(res,j-i+1);
        }
        return res;
    }
}