class Solution {
    public int minFlips(String s) {
        //brute
        // int n=s.length();
        // s=s+s;
        // StringBuilder op1=new StringBuilder();
        // StringBuilder op2=new StringBuilder();
        // for(int i=0;i<2*n;i++){
        //     op1.append((i%2==0)?"0":"1");
        //     op2.append((i%2==0)?"1":"0");
        // }
        // int l=0;
        // int flip1=0;
        // int flip2=0;
        // int res=Integer.MAX_VALUE;
        // for(int i=0;i<2*n;i++) {
        //     if(s.charAt(i)!=op1.charAt(i)){
        //         flip1++;
        //     }
        //     if(s.charAt(i)!=op2.charAt(i)){
        //         flip2++;
        //     }
        //     if(i-l+1>n){
        //         if(s.charAt(l)!=op1.charAt(l)){
        //             flip1--;
        //         }
        //         if(s.charAt(l)!=op2.charAt(l)){
        //             flip2--;
        //         }
        //         l++;
        //     }
        //     if(i-l+1==n){
        //         res=Math.min(res,Math.min(flip1,flip2));
        //     }
        // }
        // return res;


        //better
        // int n=s.length();
        // StringBuilder s1=new StringBuilder();
        // StringBuilder s2=new StringBuilder();
        // for(int i=0;i<2*n;i++){
        //     s1.append(i%2==0?"0":"1");
        //     s2.append(i%2==0?"1":"0");
        // }
        // int l=0;
        // int flip1=0;
        // int flip2=0;
        // int res=Integer.MAX_VALUE;
        // for(int i=0;i<2*n;i++){
        //     if(s.charAt(i%n)!=s1.charAt(i)){
        //         flip1++;
        //     }
        //     if(s.charAt(i%n)!=s2.charAt(i)){
        //         flip2++;
        //     }
        //     if(i-l+1>n){
        //         if(s.charAt(l%n)!=s1.charAt(l)){
        //             flip1--;
        //         }
        //         if(s.charAt(l%n)!=s2.charAt(l)){
        //             flip2--;
        //         }
        //         l++;
        //     }
        //     if(i-l+1==n){
        //         res=Math.min(res,Math.min(flip1,flip2));
        //     }
        // }
        // return res;

        //optimal o(1) space
        int n=s.length();
        StringBuilder s1=new StringBuilder();
        StringBuilder s2=new StringBuilder();
        // for(int i=0;i<n;i++){
        //     s1.append(i%2==0?"0":"1");
        //     s2.append(i%2==0?"1":"0");
        // }
        int l=0;
        int flip1=0;
        int flip2=0;
        int res=Integer.MAX_VALUE;
        //expected character if i is odd->0 else 1
        for(int i=0;i<2*n;i++){
            int expCh1=(i%2==1)?'1':'0';
            int expCh2=(i%2==1)?'0':'1';
            if(s.charAt(i%n)!=expCh1){
                flip1++;
            }
            if(s.charAt(i%n)!=expCh2){
                flip2++;
            }
            if(i-l+1>n){
                int expC1=(l%2==1)?'1':'0';
                int expC2=(l%2==1)?'0':'1';
                if(s.charAt(l%n)!=expC1){
                    flip1--;
                }
                if(s.charAt(l%n)!=expC2){
                    flip2--;
                }
                l++;
            }
            if(i-l+1==n){
                res=Math.min(res,Math.min(flip1,flip2));
            }
        }
        return res;
    }
}
    