class Solution {
    public int compareVersion(String version1, String version2) {
        String[] ans1=version1.split("\\.");
        String[] ans2=version2.split("\\.");
        int i=0;
        int j=0;
        int n1=ans1.length;
        int n2=ans2.length;
        int n=Math.max(n1,n2);
        while(i<n || j<n){
            int ver1=0;
            int ver2=0;
            if(i<n1){
                ver1=Integer.parseInt(ans1[i]);
            }
            if(j<n2){
                ver2=Integer.parseInt(ans2[j]);
            }
            
            if(ver1>ver2){
                return 1;
            }
            if(ver1<ver2){
                return -1;
            }
                i++;
                j++;
        }
        
        return 0;
    }
}