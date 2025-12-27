class Solution {
    public int countPairs(int[] arr) {
        int n=arr.length;
        int MOD=1000000007;
        HashMap<Integer,Integer> hm=new HashMap<>();
        long res=0;
        
        for(int j=0;j<n;j++){
            int pow=1;
            for(int i=0;i<22;i++){
                int y=pow-arr[j];
                if(hm.containsKey(y)){
                    res=(res+hm.get(y))%MOD;
                }
                pow<<=1;
            }
            hm.put(arr[j],hm.getOrDefault(arr[j],0)+1);
        }
        return (int)res;
    }
}
