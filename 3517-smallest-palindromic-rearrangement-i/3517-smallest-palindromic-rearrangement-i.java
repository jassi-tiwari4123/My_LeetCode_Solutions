class Solution {
    public String smallestPalindrome(String s) {
        int n=s.length();
        int mid=n/2;
        char[] half=s.substring(0,mid).toCharArray();
        Arrays.sort(half);
        StringBuilder sb=new StringBuilder();
        sb.append(new String(half));
        // return sb.toString();
        if(n%2!=0) sb.append(s.charAt(mid));
        for(int i=half.length-1;i>=0;i--){
            sb.append(half[i]);
        }
        return sb.toString();
    }
    
}