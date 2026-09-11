class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n=digits.length;
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++){
            if(digits[i]==0) continue;
            for(int j=0;j<n;j++){
                if(i==j) continue;
                for(int k=0;k<n;k++){
                    if(i==k || j==k) continue;
                    if(digits[k]%2!=0) continue;
                    int nums=digits[i]*100+digits[j]*10+digits[k];
                    hs.add(nums);
                }
            }
        }
        int len=hs.size();
        int[] res=new int[len];
        int i=0;
        for(int x:hs){
            res[i++]=x;
        }
        Arrays.sort(res);
        return res;
    }
}