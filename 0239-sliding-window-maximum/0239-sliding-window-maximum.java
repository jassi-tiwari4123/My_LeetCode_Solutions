class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        //brute force(tc:O(n*k))
        // int n=nums.length;
        // int[] res=new int[n-k+1];
        // int start=0;
        // int end=k-1;
        // for(int i=0;i<=n-k;i++){
        //     int maxim=Integer.MIN_VALUE;
        //     for(int j=start;j<=end;j++){
        //         int el=nums[j];
        //         maxim=Math.max(maxim,el);
        //     }
        //     start++;
        //     end++;
        //     res[i]=maxim;
        // }
        // return res;

        //optimised
        // int n=nums.length;
        // int[] res=new int[n-k+1];
        // Deque<Integer> dq=new ArrayDeque<>();
        // for(int i=0;i<n;i++){
        //     while(!dq.isEmpty() && dq.peekFirst()<=i-k){
        //         dq.pollFirst();
        //     }
        //     while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
        //         dq.pollLast();
        //     }
        //     dq.offerLast(i);
        //     if(i>=k-1){
        //         res[i-k+1]=nums[dq.peekFirst()];
        //     }
        // }
        // return res;


        // int n=nums.length;
        // int[] res=new int[n-k+1];
        // for(int i=0;i<=n-k;i++){
        //     int max=nums[i];
        //     for(int j=i;j<i+k;j++){
        //         max=Math.max(max,nums[j]);
        //     }
        //     res[i]=max;
        // }
        // return res;

        int n=nums.length;
        int[] ans=new int[n-k+1];
        int ind=0;
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<n;i++){
            //remove element from cur window
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }
            //remove smaller
            while(!dq.isEmpty() && nums[dq.peekLast()]<nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(i>=k-1) ans[ind++]=nums[dq.peekFirst()];
        }
        return ans;
    }
}