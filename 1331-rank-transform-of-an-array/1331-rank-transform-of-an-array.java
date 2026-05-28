class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] res=new int[arr.length];
        int n=arr.length;
        int[] num=Arrays.copyOf(arr,n);
        Arrays.sort(num);
        HashMap<Integer,Integer> hm=new HashMap<>();
        int j=1;
        for(int i=0;i<n;i++){
            if(hm.containsKey(num[i])){
                continue;
            }
            hm.put(num[i],j);
            j++;
        }
        for(int i=0;i<n;i++){
            res[i]=hm.get(arr[i]);
        }
        return res;
    }
}