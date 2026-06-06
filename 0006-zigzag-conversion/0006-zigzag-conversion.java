class Solution {
    public String convert(String s, int numRows) {
        // StringBuilder[] ans=new StringBuilder[numRows];
        // for(int i=0;i<numRows;i++){
        //     ans[i]=new StringBuilder();
        // }
        // int i=0;
        // while(i<s.length()){
        //     for(int index=0;index<numRows && i<s.length();index++){
        //         ans[index].append(s.charAt(i++));
        //     }
        //     for(int index=numRows-2;index>0 && i<s.length();index--){
        //         ans[index].append(s.charAt(i++));
        //     }
        // }
        // StringBuilder res=new StringBuilder();
        // for(int k=0;k<numRows;k++){
        //     res.append(ans[k]);
        // }
        // return res.toString();


        StringBuilder[] res=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            res[i]=new StringBuilder();
        }
        int i=0;
        int n=s.length();
        while(i<n){
            for(int id=0;id<numRows && i<n;id++){
                res[id].append(s.charAt(i++));
            }
            for(int id=numRows-2;id>0 && i<n;id--){
                res[id].append(s.charAt(i++));
            }
        }
        StringBuilder ans=new StringBuilder();
        for(int j=0;j<numRows;j++){
            ans.append(res[j]);
        }
        return ans.toString();
    }
}