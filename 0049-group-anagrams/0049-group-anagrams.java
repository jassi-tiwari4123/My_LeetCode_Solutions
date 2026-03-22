class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //idea - hum ek ek karke string lenge usko sort kar lenge then uss string ko key bana lenge then we will
        // try to iterate over other strings sort them and if exist in the hashmap then add in the value of key
        // else we will make that string a new key
        HashMap<String,List<String>> hm=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] c=s.toCharArray();
            Arrays.sort(c);
            String st=new String(c);
            hm.putIfAbsent(st,new ArrayList<>());
            hm.get(st).add(s);
        }
        return new ArrayList<>(hm.values());
    }
}