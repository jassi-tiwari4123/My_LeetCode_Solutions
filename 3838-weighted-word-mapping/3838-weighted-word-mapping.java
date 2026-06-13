class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        int n=words.length;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<n;i++){
            String s=words[i];
            int sum=0;
            for(int j=0;j<s.length();j++){
                sum=(sum+weights[s.charAt(j)-'a'])%26;
            }
            char ch=(char)('z'-sum);
            sb.append(ch);
        }
        return sb.toString();
    }
}