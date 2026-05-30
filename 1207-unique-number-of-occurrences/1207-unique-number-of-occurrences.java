class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int f:hm.values()){
            // if(hs.contains(f)) return false;
            // hs.add(f);
            if(!hs.add(f)) return false;
            
        }
        return true;
    }
}