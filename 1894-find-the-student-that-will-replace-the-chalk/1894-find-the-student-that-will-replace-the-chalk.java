class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum=0;
        int n=chalk.length;
        for(int i=0;i<n;i++){
            sum+=chalk[i];
        }
        long left=k%sum;
        long cycle=k/sum;
        int x=0;
        while(x<n){
            if(chalk[x]>left){
                return x;
            }
            left-=chalk[x];
            x++;
        }
        return x;
    }
}