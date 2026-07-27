class Solution {
    public int minOperations(int n, int m) {
        int LIMIT=10000;
        boolean[] prime=new boolean[LIMIT];
        Arrays.fill(prime,true);
        prime[0]=prime[1]=false;
        for(int i=2;i*i<LIMIT;i++) {
            if(prime[i]){
                for(int j=i*i;j<LIMIT;j+=i){
                    prime[j]=false;
                }
            }
        }
        if(prime[n] || prime[m]) return -1;
        int len=String.valueOf(n).length();
        long[] dist=new long[LIMIT];
        Arrays.fill(dist,Long.MAX_VALUE);
        PriorityQueue<long[]> pq =new PriorityQueue<>((a, b) -> Long.compare(a[0],b[0]));
        dist[n]=n;
        pq.offer(new long[]{n,n}); 
        while (!pq.isEmpty()) {
            long[] cur=pq.poll();
            long cost=cur[0];
            int num=(int) cur[1];
            if(cost>dist[num]) continue;
            if(num==m) return (int) cost;
            List<Integer> adj=new ArrayList<>();
            increaseDigit(num,len,prime,adj);
            decreaseDigit(num,len,prime,adj);
            for(int next:adj){
                long newCost=cost+next;
                if (newCost<dist[next]) {
                    dist[next]=newCost;
                    pq.offer(new long[]{newCost,next});
                }
            }
        }
        return -1;
    }
    public void increaseDigit(int num,int len,boolean[] prime,List<Integer> adj) {
        char[] digits=String.format("%0"+len+"d",num).toCharArray();
        for(int i=0;i<len;i++) {
            if(digits[i]=='9') continue;
            digits[i]++;
            int next=Integer.parseInt(new String(digits));
            if(!prime[next]) {
                adj.add(next);
            }
            digits[i]--;
        }
    }
    public void decreaseDigit(int num,int len,boolean[] prime,List<Integer> adj) {
        char[] digits=String.format("%0"+len+"d",num).toCharArray();
        for(int i=0;i<len;i++){
            if(digits[i]=='0') continue;
            digits[i]--;
            int next=Integer.parseInt(new String(digits));
            if(String.valueOf(next).length()==len && !prime[next]) {
                adj.add(next);
            }
            digits[i]++;
        }
    }
}