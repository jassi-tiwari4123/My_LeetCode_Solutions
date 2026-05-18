class Solution {
    public String reformat(String s) {
        StringBuilder dig=new StringBuilder();
        StringBuilder ch=new StringBuilder();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(Character.isDigit(c)) dig.append(c);
            if(Character.isLetter(c)) ch.append(c);
        }
        int nd=dig.length();
        int nc=ch.length();
        if(Math.abs(nd-nc)>1) return "";
        boolean digStart=nd>nc;
        int i=0;
        int j=0;
        while(i<nd || j<nc){
            if(digStart && i<nd){
                sb.append(dig.charAt(i));
                i++;
            }
            if(j<nc){
                sb.append(ch.charAt(j));
                j++;
            }
            if(!digStart && i<nd){
                sb.append(dig.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}