class Solution {
    public int getLeastFrequentDigit(int n) {
        HashMap <Integer,Integer> hm = new HashMap();
        ArrayList<Integer> arr=new ArrayList<>();
        while(n>0){
            int dig=n%10;
            hm.put(dig,hm.getOrDefault(dig, 0)+1);
            n/=10;
        }
        int small=Integer.MAX_VALUE;
        for(Integer value:hm.values()){
            if(small>value){
                small=value;
            }
        }
        for(Map.Entry<Integer,Integer> entry:hm.entrySet()){
            if(entry.getValue()==small){
                arr.add(entry.getKey());
            }
        }
        Collections.sort(arr);
        return arr.get(0);
    }
}