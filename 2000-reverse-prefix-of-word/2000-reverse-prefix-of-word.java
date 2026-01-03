class Solution {
    public String reversePrefix(String s, char ch) {
        int ind=s.indexOf(ch);
        if(ind==-1) return s;
        StringBuilder sb=new StringBuilder(s);
        StringBuilder part1=new StringBuilder(sb.substring(0,ind+1)).reverse();
        StringBuilder part2=new StringBuilder(sb.substring(ind+1));
        return part1.append(part2).toString();
    }
}