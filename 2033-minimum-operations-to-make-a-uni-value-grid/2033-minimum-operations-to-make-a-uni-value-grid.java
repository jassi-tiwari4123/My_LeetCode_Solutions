class Solution {
    public int minOperations(int[][] grid, int x) {

        //DO it next week (3rd may)

        //flat karke sort karke we will proceed 
        //flat the grid first

        int n=grid.length;
        int m=grid[0].length;
        int[] arr=new int[n*m];
        for(int i=0;i<n*m;i++){
            int r=i/m;
            int c=i%m;
            arr[i]=grid[r][c];
        }
        Arrays.sort(arr);

        //now checking ki jo numbers given hai kya vo same remainder de rhe hain if divides all element as they decrease and increase int same manner x
        int r=arr[0]%x;
        for(int i=1;i<n*m;i++){
            if(arr[i]%x!=r) return -1;
        }

        //now finding median kyunki humko absolute difference kam karna hai , mean tab nikalte jab sq diff kam karna hota
        int med=arr[(n*m)/2];

        // ab operations count kar lenege
        int res=0;
        for(int i=0;i<n*m;i++){
            res+=Math.abs(arr[i]-med)/x;
        }
        return res;
    }
}