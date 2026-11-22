class Solution {
    public boolean areNumbersAscending(String s) {
        String[] st=s.split(" ");
        boolean sorted=true;
        int prev=Integer.MIN_VALUE;
        for(String x:st){
            if(x.matches("\\d+")){
                int num=Integer.parseInt(x);
                if(num<=prev){
                    sorted=false;
                    break;
                }
                prev=num;
            }
        }
        return sorted;
    }
}