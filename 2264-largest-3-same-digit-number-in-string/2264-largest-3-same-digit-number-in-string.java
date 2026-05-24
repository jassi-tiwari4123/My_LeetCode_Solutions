class Solution {
    public String largestGoodInteger(String num) {
        int n=num.length();
        char max=0;
        for(int i=2;i<n;i++){
            char ch=num.charAt(i);
            if(((i-2)>=0 && num.charAt(i-2)==ch) && ((i-1)>=0 && num.charAt(i-1)==ch)){
                if(ch>max){
                    max=ch;
                }
            }
        }
        if(max==0) return "";
        return ""+max+max+max;
    }
}