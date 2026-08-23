class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        int n=names.length;
        HashMap<Integer,String> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.put(heights[i],names[i]);
        }
        Arrays.sort(heights);
        int i=0;
        int j=n-1;
        while(i<j){
            int temp=heights[i];
            heights[i]=heights[j];
            heights[j]=temp;
            i++;
            j--;
        }
        
        String[] res=new String[n];
        for(int k=0;k<n;k++){
            res[k]=hm.get(heights[k]);
        }
        return res;
    }
}