class Solution {
    public String generateTheString(int n) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append("a");
        }
        if(n%2==0){
            return sb.substring(0,n-1)+"b".toString();
        }
        return sb.toString();
    }
}