class Solution {
    public boolean checkString(String s) {
        // String st="ba";
        // return !(s.contains(st));

        int lastA=-1;
        int firstB=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                lastA=i;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='b'){
                firstB=i;
                break;
            }
        }
        if(firstB==-1 || lastA==-1) return true;

        return lastA<firstB;
    }
}