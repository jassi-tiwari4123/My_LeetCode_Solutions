class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n=arr1.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            int num=arr1[i];
            while(num>0){
                hs.add(num);
                num/=10;
            }
        }
        int res=0;
        for(int i=0;i<arr2.length;i++){
            while(arr2[i]>0){
                if(hs.contains(arr2[i])){
                    String s=String.valueOf(arr2[i]);
                    int len=s.length();
                    res=Math.max(res,len);
                    break;
                }
                arr2[i]/=10;
            }
        }
        return res;
    }
}