class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] nse=findNextSmaller(heights);
        int[] pse=findPrevSmaller(heights);
        int maxi=0;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            maxi=Math.max(maxi,area);
        }
        return maxi;
    }
    public int[] findNextSmaller(int[] arr){
        int n=arr.length;
        int[] ns=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>=arr[i]){
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
    public int[] findPrevSmaller(int[] arr){
        int n=arr.length;
        int[] ps=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
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