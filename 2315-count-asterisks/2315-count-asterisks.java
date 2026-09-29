// class Solution {
//     public int countAsterisks(String s) {
//         int n=s.length();
//         int cnt=0;
//         boolean ins=false;
//         for(int i=0;i<n;i++){
//             if(s.charAt(i)=='|'){
//                 ins=!ins;
//             }
//             if(s.charAt(i)=='*' && !ins) cnt++;
//         }
//         return cnt;
//     }
// }


class Solution {
    public int countAsterisks(String s) {
        int n=s.length();
        int cnt=0;
        int res=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='|'){
                cnt++;
            }
            else if(cnt%2==0 && s.charAt(i)=='*') res++;
        }
        return res;
    }
}