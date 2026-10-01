class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int n=s.length();
        int m=shifts.length;
        //concept of array difference 
        int[] diff=new int[n];
        for(int[] a:shifts){
            int start=a[0];
            int end=a[1];
            int dir=a[2];
            int val=dir==0?-1:1;
            diff[start]+=val;
            if(end+1<n) diff[end+1]-=val;
        }
        //cumulative sum
        int[] pref=new int[n];
        pref[0]=diff[0];
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+diff[i];
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            int dif=pref[i]%26;
            if(dif<0) dif+=26;
            char c=(char)(((ch-'a'+dif)%26)+'a');
            sb.append(c);
        }
        return sb.toString();
    }
}