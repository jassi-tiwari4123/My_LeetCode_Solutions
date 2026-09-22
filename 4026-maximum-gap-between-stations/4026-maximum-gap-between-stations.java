class Solution {
    public int maximumGap(String skill, String station) {
        int res=0;
        int n=skill.length();
        int m=station.length();
        int[] first=new int[n];
        int[] back=new int[n];
        int j=0;
        for(int i=0;i<m;i++){
            char ch1=station.charAt(i);
            char ch2=skill.charAt(j);
            if(ch1==ch2) {
                first[j++]=i;
            }
            if(j==n) break;
        }
        int k=n-1;
        for(int i=m-1;i>=0;i--){
            char ch1=station.charAt(i);
            char ch2=skill.charAt(k);
            if(ch1==ch2) {
                back[k--]=i;
            }
            if(k<0) break;
        }
        for(int i=1;i<n;i++){
            res=Math.max(back[i]-first[i-1],res);
        }
        return res;

    }
}