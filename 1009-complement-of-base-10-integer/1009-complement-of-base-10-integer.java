class Solution {
    public int bitwiseComplement(int n) {
        String bin=Integer.toBinaryString(n);
        StringBuilder flip=new StringBuilder();
        for(int i=0;i<bin.length();i++){
            if(bin.charAt(i)=='0'){
                flip.append('1');
            }
            else{
                flip.append('0');
            }
        }
        int res=Integer.parseInt(flip.toString(),2);
        return res;
    }
}