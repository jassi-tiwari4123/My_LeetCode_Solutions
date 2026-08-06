class Solution {
    public int minBitFlips(int start, int goal) {
        int xor=start^goal;
        String binary=toBinary(xor);
        int res=0;
        for(int i=0;i<binary.length();i++){
            if(binary.charAt(i)=='1') res++;
        }
        return res;
    }
    public String toBinary(int num){
        StringBuilder sb=new StringBuilder();
        while(num>0){
            int rem=num%2;
            sb.append(rem);
            num/=2;
        }
        return sb.reverse().toString();
    }
}