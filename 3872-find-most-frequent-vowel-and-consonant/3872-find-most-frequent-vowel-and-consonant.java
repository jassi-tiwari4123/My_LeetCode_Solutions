class Solution {
    public int maxFreqSum(String s) {
        int x=isVowel(s);
        return x;
    }
    public int isVowel(String s){
        HashMap<Character,Integer> hm=new HashMap<>();
        HashMap<Character,Integer> hm1=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(vowel(s.charAt(i))){
                hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
            }
            else{
                hm1.put(s.charAt(i),hm1.getOrDefault(s.charAt(i),0)+1);
            }
        }
        int maxVow=0;
        int maxCon=0;
        for(Map.Entry<Character,Integer> entry:hm.entrySet()){
            if(entry.getValue()>maxVow){
                maxVow=entry.getValue();
            }
        }
        for(Map.Entry<Character,Integer> entry:hm1.entrySet()){
            if(entry.getValue()>maxCon){
                maxCon=entry.getValue();
            }
        }
        int count=maxVow+maxCon;
        return count;
    }
    
    public boolean vowel(char a){
        if(a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u'|| a=='A'|| a=='E'|| a=='I'|| a=='O'|| a=='U'){
            return true;
        }
        return false;
    }
}