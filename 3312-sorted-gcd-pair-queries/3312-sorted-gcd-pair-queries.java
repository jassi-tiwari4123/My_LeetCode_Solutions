class Solution {
    public int[] gcdValues(int[] nums, long[] queries) {
        //brute
    //     int n=nums.length;
    //     int[] gcdPairs=new int[n*(n-1)/2];
    //     int x=0;
    //     for(int i=0;i<n-1;i++){
    //         for(int j=i+1;j<n;j++){
    //             gcdPairs[x++]=gcd(nums[i],nums[j]);
    //         }
    //     }
    //     Arrays.sort(gcdPairs);
    //     int q=queries.length;
    //     int[] res=new int[q];
    //     for(int i=0;i<q;i++){
    //         res[i]=gcdPairs[(int)queries[i]];
    //     }
    //     return res;
    // }
    // public int gcd(int a,int b){
    //     while(b!=0){
    //         int temp=a%b;
    //         a=b;
    //         b=temp;
    //     }
    //     return a;

        //optimal
        // here problem is by generating all pairs gcd it will give tle: o(n^2)
        // tackle this problem by finding how many numbers have gcd 'g' where g->1 to max of nums array

        int max=0;
        for(int x:nums){
            if(x>max){
                max=x;
            }
        }

        //frequency of each element in an array
        int[] fr=new int[max+1];
        for(int x:nums){
            fr[x]++;
        }

        //count of numbers having exact gcd 'g'
        long[] exact=new long[max+1];
        for(int g=max;g>=1;g--){

            //count divisble numbers
            long count=0;
            for(int mul=g;mul<=max;mul+=g){
                count+=fr[mul];       
            }
            //total possible pairs
            long pairs=count*(count-1)/2;

            //remove extra larger gcd pairs
            long exPairs=0;
            for(int mul=2*g;mul<=max;mul+=g){
                exPairs+=exact[mul];
            }

            //remaining exact pairs
            exact[g]=pairs-exPairs;
        }

        //it will store the count of numbers having gcd g
        long[] pref=new long[max+1];
        pref[0]=0;
        for(int i=1;i<=max;i++){
            pref[i]=pref[i-1]+exact[i]; 
            //pref[i] stores the total number of pairs whose GCD is less than or equal to i.
        }

        //results for queries
        int q=queries.length;
        int[] res=new int[q];
        for(int i=0;i<q;i++){
            long target=queries[i]+1;
            int l=1;
            int r=max;
            while(l<r){
                int mid=l+(r-l)/2;
                if(pref[mid]>=target){
                    r=mid;
                }
                else{
                    l=mid+1;
                }
            }
            res[i]=l;
        }
        return res;
    }
}