class Solution {
    public boolean wordPattern(String pattern, String s) {
        int n=pattern.length();
        String[] arr=s.split(" ");
        int len=arr.length;
        if(n!=len) return false;
        HashMap<Character,String> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=pattern.charAt(i);
            String st=arr[i];
            if(hm.containsKey(ch)){
                if(!hm.get(ch).equals(st)) return false;
            }
            else{
                if(hm.containsValue(st)){
                    return false;
                }
                hm.put(ch,st);
            }
        }
        return true;
    }
}