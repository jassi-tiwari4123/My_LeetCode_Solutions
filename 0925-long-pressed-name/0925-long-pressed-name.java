class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int n=name.length();
        int m=typed.length();
        int i=0;
        int j=0;
        while(i<n && j<m){
            char ch1=name.charAt(i);
            char ch2=typed.charAt(j);
            if(ch1==ch2){
                i++;
                j++;
            }
            else{
                if(j==0 || (j-1>=0 && ch2!=typed.charAt(j-1))){
                    return false;
                }
                j++;
            }
        }
        // if character left in name
        //check i==n
        if(i!=n) return false;
        while(j<m){
            if(typed.charAt(j)!=typed.charAt(j-1)) {
                return false;
            }
            j++;
        }
        return true;
    }
}