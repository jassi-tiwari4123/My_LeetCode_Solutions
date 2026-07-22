class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=1;i<=n;i++){
            int sum=sumOfDig(i);
            hm.put(sum,hm.getOrDefault(sum,0)+1);
        }
        int max=0;
        for(int count:hm.values()){
            max=Math.max(max,count);
        }
        int res=0;
        for(int count:hm.values()){
            if(count==max){
                res++;
            }
        }
        return res;
    }
    public int sumOfDig(int x){
        int sum=0;
        while(x>0){
            int dig=x%10;
            sum+=dig;
            x/=10;
        }
        return sum;
    }
}