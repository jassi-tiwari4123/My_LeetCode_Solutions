class Solution {
    public char[][] rotateTheBox(char[][] boxGrid) {
        int n=boxGrid.length;
        int m=boxGrid[0].length;
        for(int i=0;i<n;i++){
            int ind=m-1;//yaha stones ko displace kar rhe hain right side due to gravity
            for(int j=m-1;j>=0;j--){
                if(boxGrid[i][j]=='*'){
                    ind=j-1;
                }
                else if(boxGrid[i][j]=='#'){
                    char temp=boxGrid[i][ind];
                    boxGrid[i][ind]='#';
                    boxGrid[i][j]=temp;
                    ind--;
                }
            }
        }
        //now reseting to 90 deg 
        char[][] op=new char[m][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                op[j][n-1-i]=boxGrid[i][j];
            }
        }
        return op;
    }
}