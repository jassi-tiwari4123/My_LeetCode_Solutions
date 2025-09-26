class Solution {
    public int myAtoi(String s) {
        if(s.length()==0){
            return 0;
        }
        String temp=s.strip();
        if(temp.length()==0){
            return 0;
        }
        boolean sign=false;
        int i=0;
        StringBuilder sb=new StringBuilder();
        if(i<temp.length() && (temp.charAt(i)=='-'|| temp.charAt(i)=='+' )){
            sign=temp.charAt(i)=='-';
            i++;
        }
        while(i<temp.length() && Character.isDigit(temp.charAt(i))){
            sb.append(temp.charAt(i));
            i++;
        }
        if(sb.length()==0){
            return 0;
        }
        long num=0;
        for(int k=0;k<sb.length();k++){
            int dig=sb.charAt(k)-'0';
            if(num>(Integer.MAX_VALUE-dig)/10){
                return sign?Integer.MIN_VALUE:Integer.MAX_VALUE;
            }
            num=num*10+dig;
        }
        if(sign==true){
            num=-num;
        }
        return (int) num;
    }
}