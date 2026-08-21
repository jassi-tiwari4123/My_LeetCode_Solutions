class Solution {
    public long findKthSmallest(int[] coins, int k) {
        //brute using min heap even though we cant make the array as k is 2*10^9 which is impossible for array creation
        // int n=coins.length;
        // PriorityQueue<long[]> pq=new PriorityQueue<>((a,b)->Long.compare(a[0],b[0]));
        // for(int i=0;i<n;i++){
        //     pq.add(new long[]{coins[i],coins[i]});
        // }
        // long res=0;
        // long count=0;
        // long prev=-1;
        // while(count<k){
        //     long[] cur=pq.poll();
        //     long mul=cur[0];
        //     long coin=cur[1];
        //     if(mul!=prev){
        //         res=mul;
        //         prev=mul;
        //         count++;
        //     }
        //     pq.add(new long[]{mul+coin,coin});
        // }
        // return res;



        //actual solution
        //binary search on answer as we only need to find the lowerbound for mid
        long low=1;
        long min=Integer.MAX_VALUE;
        for(int x:coins){
            min=Math.min(min,x);
        }
        long high=min*(long)k;
        while(low<high){
            long mid=low+(high-low)/2;
            long count=count(mid,coins);
            if(count>=k){
                high=mid;
            } 
            else {
                low=mid+1;
            }
        }
        return low;
    }

    public long count(long x,int[] coins) {
        int n=coins.length;
        long res=0;
        // Inclusion-Exclusion
        for (int mask=1;mask<(1<<n);mask++){
            long lcm=1;
            int bits=0;
            boolean valid=true;
            for(int i=0;i<n;i++){
                if((mask & (1<<i))!=0){
                    bits++;
                    lcm=getLCM(lcm,coins[i]);
                    if(lcm>x){
                        valid=false;
                        break;
                    }
                }
            }
            if(!valid){
                continue;
            }
            long dup=x/lcm;
            if(bits%2==1){
                res+=dup;
            } 
            else{
                res-=dup;
            }
        }
        return res;
    }
    public long getLCM(long a,long b){
        return a/gcd(a,b)*b;
    }
    public long gcd(long a,long b){
        while(b!=0){
            long temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}