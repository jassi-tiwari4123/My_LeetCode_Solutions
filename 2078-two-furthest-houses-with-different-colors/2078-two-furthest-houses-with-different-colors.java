class Solution {
    public int maxDistance(int[] colors) {
        int i=0;
        int n=colors.length;
        int res=0;
        while(i<n){
            int j=n-1;
            while(j>i){
                if(colors[i]!=colors[j]){
                    int diff=Math.abs(i-j);
                    res=Math.max(diff,res);
                    break;
                }
                j--;
            }
            i++;
        }
        return res;
    }
}