class Solution {
    public String digitSum(String s, int k) {
        int n=s.length();
        while(n>k){
            StringBuilder res=new StringBuilder();
            for(int i=0;i<n;i+=k){
                int end=Math.min(i+k,s.length());
                String grp=s.substring(i,end);
                int sum=0;
                for(char j:grp.toCharArray()){
                    sum+=j-'0';
                }
                res.append(sum);
            }
            s=res.toString();
            n=s.length();
        }
        return s;
    }
}