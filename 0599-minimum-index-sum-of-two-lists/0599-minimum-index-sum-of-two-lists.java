class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int n=list1.length;
        int m=list2.length;
        HashMap<String,Integer> hm=new HashMap<>();
        int res=Integer.MAX_VALUE;
        ArrayList<String> op=new ArrayList<>();
        for(int i=0;i<n;i++){
            hm.put(list1[i],i);
        }
        for(int i=0;i<m;i++){
            if(hm.containsKey(list2[i])){
                int sum=i+hm.get(list2[i]);
                if(sum<res){
                    res=sum;
                    op.clear();
                    op.add(list2[i]);
                }
                else if(sum==res){
                    op.add(list2[i]);
                }
            }
        }
        int s=op.size();
        String[] st=new String[s];
        for(int i=0;i<s;i++){
            st[i]=op.get(i);
        }
        return st;
    }
}