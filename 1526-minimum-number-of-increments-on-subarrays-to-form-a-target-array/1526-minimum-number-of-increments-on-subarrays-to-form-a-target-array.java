class Solution {
    public int minNumberOperations(int[] target) {
        int n=target.length;
        int cur=0;
        int prev=0;
        int res=0;
        for(int i=0;i<n;i++){
            cur=target[i];
            if(cur>prev){
                res+=cur-prev;
            }
            prev=cur;
        }
        return res;
        
    }
}