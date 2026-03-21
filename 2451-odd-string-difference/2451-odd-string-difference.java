class Solution {
    public String oddString(String[] words) {
        int n=words.length;
        List<Integer> l1=diff(words[0]);
        List<Integer> l2=diff(words[1]);
        List<Integer> l3=diff(words[2]);
        List<Integer> match;
        if(l1.equals(l2) || l1.equals(l3)){
            match=l1;
        }
        else{
            match=l2;
        }
        for(int i=0;i<n;i++){
            if(!diff(words[i]).equals(match)){
                return words[i];
            }
        }
        return "";
    }
    public List<Integer> diff(String w){
        List<Integer> d=new ArrayList<>();
        for(int i=1;i<w.length();i++){
            d.add(w.charAt(i)-w.charAt(i-1));
        }
        return d;
    }
}