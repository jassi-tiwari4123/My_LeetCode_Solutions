class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
          ArrayList<Integer> a=new ArrayList<>();
        int n1=spells.length;
        int n2=potions.length;
        // Arrays.sort(spells);
        Arrays.sort(potions);
        int i=0;
        while(i<n1){
            int left=0;
            int right=n2-1;
            int ind=n2;
            while(left<=right){
                int mid=left+(right-left)/2;
                if((long)spells[i]*potions[mid]>=success){
                    ind=mid;
                    right=mid-1;
                }
                else{
                    left=mid+1;
                }
            }
            int ans=n2-ind;
            a.add(ans);
            i++;
        }
        int[] res=new int[a.size()];
        for(int x=0;x<a.size();x++){
            res[x]=a.get(x);
        }
        return  res;
    }
}