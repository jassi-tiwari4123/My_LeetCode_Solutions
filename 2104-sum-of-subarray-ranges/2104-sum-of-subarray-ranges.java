class Solution {
    public long subArrayRanges(int[] nums) {
        // Time complexity:O(n^2)
        // int n=nums.length;
        // long sum=0;
        // for(int i=0;i<n;i++){
        //     int largest=nums[i];
        //     int smallest=nums[i];
        //     for(int j=i+1;j<n;j++){
        //         largest=Math.max(largest,nums[j]);
        //         smallest=Math.min(smallest,nums[j]);
        //         sum=sum+(largest-smallest);
        //     }
        // }
        // return sum;


        //O(n)
        return sumMaxSubarray(nums)-sumMinSubarray(nums);
    }

    public long sumMaxSubarray(int[] nums){
        //compute next greater array and prev greater array
        int[] nge=nextGreater(nums);
        int[] pgee=prevGreater(nums);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int left=i-pgee[i];
            int right=nge[i]-i;
            long contri=1L*left*right;
            sum+=contri*nums[i];
        }
        return sum;
    }

    public long sumMinSubarray(int[] nums){
        //compute next smaller array and prev smaller array
        int[] nse=nextSmaller(nums);
        int[] psee=prevSmaller(nums);
        long sum=0;
        for(int i=0;i<nums.length;i++){
            int left=i-psee[i];
            int right=nse[i]-i;
            long contri=1L*left*right;
            sum+=contri*nums[i];
        }
        return sum;
    }

    public int[] nextSmaller(int[] nums){
        int n=nums.length;
        int[] ns=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i]){
                st.pop();
            }
            if(st.isEmpty()) ns[i]=n;
            else{
                ns[i]=st.peek();
            }
            st.push(i);
        }
        return ns;
    }

    public int[] nextGreater(int[] nums){
        int n=nums.length;
        int[] ng=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i]){
                st.pop();
            }
            if(st.isEmpty()) ng[i]=n;
            else{
                ng[i]=st.peek();
            }
            st.push(i);
        }
        return ng;
    }

    public int[] prevGreater(int[] nums){
        int n=nums.length;
        int[] pg=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i]){
                st.pop();
            }
            if(st.isEmpty()) pg[i]=-1;
            else{
                pg[i]=st.peek();
            }
            st.push(i);
        }
        return pg;
    }

    public int[] prevSmaller(int[] nums){
        int n=nums.length;
        int[] ps=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i]){
                st.pop();
            }
            if(st.isEmpty()) ps[i]=-1;
            else{
                ps[i]=st.peek();
            }
            st.push(i);
        }
        return ps;
    }
}