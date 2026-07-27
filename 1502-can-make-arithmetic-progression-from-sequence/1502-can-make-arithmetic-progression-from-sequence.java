class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        //O(n log n)
        // int n=arr.length;
        // Arrays.sort(arr);
        // if(n==2) return true;
        // int d=arr[1]-arr[0];
        // for(int i=2;i<n;i++){
        //     if(arr[i]-arr[i-1]!=d) return false;
        // }
        // return true;


        //O(n)
        int n=arr.length;
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        HashSet<Integer> hs=new HashSet<>();
        for(int x:arr){
            min=Math.min(min,x);
            max=Math.max(max,x);
            hs.add(x);
        }
        if(((max-min)%(n-1))!=0) return false;
        int d=(max-min)/(n-1);
        for(int i=0;i<n;i++){
            if(!hs.contains(min+i*d)) return false;
        }
        return true;
    }
}