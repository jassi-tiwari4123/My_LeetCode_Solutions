class Solution {
    public int[] evenOddBit(int n) {
        int[] res=new int[2];
        String bin=toBinary(n);
        int len=bin.length();
        int even=0;
        int odd=0;
        for(int i=0;i<len;i++){
            if(bin.charAt(i)=='1'){
                if(i%2==0) even++;
                else odd++;
            }
        }
        return new int[]{even,odd};
    }
    public String toBinary(int num){
        String res="";
        while(num!=0){
            int dig=num%2;
            res+=dig;
            num/=2;
        }
        return res;
    }
}