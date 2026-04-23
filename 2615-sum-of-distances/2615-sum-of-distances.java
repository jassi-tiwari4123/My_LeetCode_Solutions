class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long[] res=new long[n];
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.putIfAbsent(nums[i],new ArrayList<>());
            hm.get(nums[i]).add(i);
        }
        for(ArrayList<Integer> l:hm.values()){
            int size=l.size();
            long[] pref=new long[size+1];
            for(int i=0;i<size;i++){
                pref[i+1]=pref[i]+l.get(i);
            }
            for(int i=0;i<size;i++){
                int ind=l.get(i);
                long lf=(long)i*ind-pref[i];
                long r=(pref[size]-pref[i+1])-(long)(size-i-1)*ind;
                res[ind]=lf+r;
            }
        }
        return res;
    }
}