class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] arr={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<words.length;i++){
            String s=words[i];
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<s.length();j++){
                char c=s.charAt(j);
                int index=c-'a';
                sb.append(arr[index]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}