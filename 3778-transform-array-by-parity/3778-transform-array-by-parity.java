class Solution {
    public int[] transformArray(int[] arr) {
        //my approach 

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]%2==0){
        //         arr[i]=0;
        //     }
        //     else{
        //         arr[i]=1;
        //     }
        // }
        // Arrays.sort(arr);
        // return arr;

        //better approach
        int Evencount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                Evencount++;
            }
        }
        Arrays.fill(arr,0,Evencount,0);
        Arrays.fill(arr,Evencount,arr.length,1);
        return arr;
    }
}