class Solution {
    public int[] decimalRepresentation(int n) {
        if(n==0){
            return new int[]{0};
        }
        String x=String.valueOf(n);
        int l=x.length();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=0;i<l;i++){
            int zero=(l-1)-i;
            int num=(x.charAt(i)-'0')*(int)Math.pow(10, zero);
            if(num==0){
                continue;
            }
            ar.add(num);
        }
        int[] res=new int[ar.size()];
        for(int k=0;k<ar.size();k++){
            res[k]=ar.get(k);  
        }    
        return res;  
    }
}