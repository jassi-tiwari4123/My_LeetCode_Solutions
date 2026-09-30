//cyclic shift--> (char)('a'+(ch-'a'+n)%26)
class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int n=shifts.length;
        int[] suff=new int[n];
        suff[n-1]=shifts[n-1];
        for(int i=n-2;i>=0;i--){
            suff[i]=(suff[i+1]+shifts[i])%26;
        }
        // System.out.println(Arrays.toString(suff));
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            sb.append((char)('a'+(ch-'a'+(suff[i]%26))%26));
        }
        return sb.toString();
    }
}