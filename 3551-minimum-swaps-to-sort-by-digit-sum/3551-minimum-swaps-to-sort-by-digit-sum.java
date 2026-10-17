class Solution {
    public int minSwaps(int[] nums) {
        int n=nums.length;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            int num=nums[i];
            int sum=0;
            while(num>0){
                sum+=num%10;
                num/=10;
            }
            res[i]=sum;
        }
        int[][] arr=new int[n][3];
        for(int i=0;i<n;i++){
            arr[i][0]=nums[i];
            arr[i][1]=res[i];
            arr[i][2]=i;
        }
        Arrays.sort(arr,(a,b)->{
            if(a[1]==b[1]){
                return a[0]-b[0];
            }
            else return a[1]-b[1];
        });
        int cnt=0;
        boolean[] vis=new boolean[n];
        for(int i=0;i<n;i++){
            if(vis[i] || arr[i][2]==i) continue;
            int cycle=0;
            int j=i;
            while(!vis[j]){
                vis[j]=true;
                j=arr[j][2];
                cycle++;
            }
            cnt+=cycle-1;
        }
        return cnt;
    }
}