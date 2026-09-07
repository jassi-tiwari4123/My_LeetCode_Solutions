class Solution {
    public int countRotations(String s, int k) {
        int n=s.length();
        String st=s+s;
        int res=0;
        for(int i=0;i<n;i++){
            int pairs=0;
            for(int j=i;j<i+n-1;j++){
                if(st.charAt(j)==st.charAt(j+1)){
                    pairs++;
                }
            }
            if(pairs==k){
                res++;
            }
        }
        return res;

    }
}