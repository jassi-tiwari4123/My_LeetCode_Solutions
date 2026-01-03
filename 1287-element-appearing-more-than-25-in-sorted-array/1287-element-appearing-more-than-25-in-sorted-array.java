class Solution {
    public int findSpecialInteger(int[] arr) {
        double r=arr.length*0.25;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }
        int ans=0;
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()>r){
                ans=entry.getKey();
            }
        }
        return ans;
    }
}