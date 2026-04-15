public class Solution {
    public String longestCommonPrefix(String[] strs) {
        //complexity: O(n*m); where n is length of largest string and m is smallest
        //brute and vertical scanning approach best for interview
        // int n=strs.length;
        // if(n==0 || strs==null) return "";
        // for(int i=0;i<strs[0].length();i++){
        //     char ch=strs[0].charAt(i);
        //     for(int j=1;j<n;j++){
        //         if(i>=strs[j].length() || strs[j].charAt(i)!=ch){
        //             return strs[0].substring(0,i);
        //         }
        //     }
        // }
        // return strs[0];


        //optimise but sue of sorting O(n log n)
        int n=strs.length;
        Arrays.sort(strs);
        String first=strs[0];
        String last=strs[n-1];
        int i=0;
        while(i<first.length() && i<last.length() && first.charAt(i)==last.charAt(i)){
            i++;
        }
        return first.substring(0,i);
    }
}
