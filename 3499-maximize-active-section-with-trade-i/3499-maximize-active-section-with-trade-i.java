class Solution {
    public int maxActiveSectionsAfterTrade(String s) {
        //count of no of zeroes block and store in the array then find max adj sum pair
        int n=s.length();
        ArrayList<Integer> zeroes=new ArrayList<>();
        int active=0;
        for(int j=0;j<n;j++){
            if(s.charAt(j)=='1') active++;
        }
        int i=0;
        while(i<n){
            if(s.charAt(i)=='0'){
                int start=i;
                while(i<n && s.charAt(i)=='0'){
                    i++;
                }
                zeroes.add(i-start);
            }
            else{
                i++;
            }
        } 
        int sum=0;
        for(int j=1;j<zeroes.size();j++){
            sum=Math.max(sum,zeroes.get(j)+zeroes.get(j-1));
        }
        return sum+active;
    }
}