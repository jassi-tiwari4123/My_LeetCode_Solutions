class Solution {
    public int romanToInt(String st) {
        int sum=0;
        for(int i=0;i<st.length();i++){
            if((i+1)<st.length() && (getValue(st.charAt(i))<getValue(st.charAt(i+1)))){
                sum-=getValue(st.charAt(i));
            }
            else{
                sum+=getValue(st.charAt(i));
            }
        }
        return sum;
    }
    public static int getValue(char ch){
        switch (ch) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }
}  
    