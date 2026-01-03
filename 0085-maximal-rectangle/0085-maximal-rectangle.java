class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int[][] prefix=new int[m][n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<m;j++){
                if(matrix[j][i]=='1'){
                    sum++;
                }
                else{
                    sum=0;
                }
                prefix[j][i]=sum;
            }
        }
        int maxArea=0;
        for(int i=0;i<m;i++){
            maxArea=Math.max(maxArea,largestRect(prefix[i]));
        }
        return maxArea;
    }
    public int largestRect(int[] prefix){
        int n=prefix.length;
        int[] nse=findNextSmaller(prefix);
        int[] pse=findPrevSmaller(prefix);
        int area=0;
        for(int i=0;i<n;i++){
            area=Math.max(area,prefix[i]*(nse[i]-pse[i]-1));
        }
        return area;
    }
    public int[] findNextSmaller(int[] prefix){
        int n=prefix.length;
        int[] ns=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && prefix[st.peek()]>=prefix[i]){
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
    public int[] findPrevSmaller(int[] prefix){
        int n=prefix.length;
        int[] ps=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && prefix[st.peek()]>prefix[i]){
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