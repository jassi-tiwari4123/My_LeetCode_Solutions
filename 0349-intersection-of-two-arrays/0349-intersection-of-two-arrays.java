class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // int n=nums1.length;
        // HashSet<Integer> hs=new HashSet<>();
        // for(int i=0;i<n;i++){
        //     hs.add(nums1[i]);
        // }
        // HashSet<Integer> res=new HashSet<>();
        // for(int i=0;i<nums2.length;i++){
        //     if(hs.contains(nums2[i])){
        //         res.add(nums2[i]);
        //     }
        // }
        // int[] arr=new int[res.size()];
        // int i=0;
        // for(int x:res){
        //     arr[i++]=x;
        // }
        // return arr;

        int n1=nums1.length;
        int n2=nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0;
        int j=0;
        HashSet<Integer> hs=new HashSet<>();
        while(i<n1 && j<n2){
            if(nums1[i]==nums2[j]){
                hs.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        int[] arr=new int[hs.size()];
        int k=0;
        for(int x:hs){
            arr[k++]=x;
        }
        return arr;
    }
}