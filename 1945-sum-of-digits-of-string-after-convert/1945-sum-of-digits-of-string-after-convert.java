class Solution {
    public int getLucky(String s, int k) {
        int n=s.length();
        String num="";
        for(int i=0;i<n;i++){
            num+=(s.charAt(i)-'a')+1;
        }
        while(k>0){
            int sum=0;
            for(int i=0;i<num.length();i++){
                sum+=num.charAt(i)-'0';
            }
            num=String.valueOf(sum);
            k--;
        }
        return Integer.parseInt(num);
    }
}