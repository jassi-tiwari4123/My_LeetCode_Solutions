class Solution {

    long mod=1000000007L;

    public int countAnagrams(String s) {
        //logic toh samajh aa gya ki permutaion ka formula lagg sakta hai repeated element count karke har string word ka divide by the repeated number of charcter factorial
        //we will maintain an array of factorial . precomputed to reduce the time complexity as we cant process factorial every time as it will lead to TLE


        String[] word=s.split(" ");
        //factorial array

        long[] fact=new long[100001];
        fact[0]=1;
        fact[1]=1;
        for(int i=2;i<=100000;i++){
            fact[i]=((fact[i-1]%mod)*(i%mod))%mod;
        }

        long res=1;
        //ab word to word dekehenge
        for(String x:word){
            int n=x.length();
            long ways=fact[n];
            //freq for len of word
            int[] freq=new int[26];
            for(int i=0;i<n;i++){
                freq[x.charAt(i)-'a']++;
            }
            //checking for repeated word
            for(int f:freq){
                if(f>1){
                    //modular inverse mein hum a/b na likhke a*b^-1 karte hain
                    ways=(ways*modInverse(fact[f]))%mod;
                }
            }
            res=(res*ways)%mod;
        }
        return (int) res;
    }
    //modular inverse
    public long modInverse(long x){
        return pow(x,mod-2);
    }
    public long pow(long a,long b){
        long res=1;
        while(b>0){
            if((b&1)==1){
                res=(res*a)%mod;
            }
            a=(a*a)%mod;
            b/=2;
        }
        return res;
    }
    
}