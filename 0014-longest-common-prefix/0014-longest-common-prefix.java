public class Solution {
    public String longestCommonPrefix(String[] strs) {
        //o(n*m)
        // int n=strs.length;
        // if(n==0 || strs==null) return "";
        // String first=strs[0];
        // for(int i=0;i<first.length();i++){
        //     char ch=first.charAt(i);
        //     for(int j=1;j<n;j++){
        //         if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
        //             return first.substring(0,i);
        //         }
        //     }
        // }
        // return first;


        //O(nlog n+m)
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[strs.length-1];
        int i=0;
        while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}
