class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)) return "";
        int n=str1.length();
        int m=str2.length();
        int part=gcd(n,m);
        return str1.substring(0,part);
    }
    public int gcd(int n,int m){
        while(m!=0){
            int temp=n%m;
            n=m;
            m=temp;
        }
        return n;
    }
}