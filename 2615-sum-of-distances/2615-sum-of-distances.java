//simply humne observe kiya ki left handside kitne occurence hain selected element ka and right handside kitne
//1,2,1,1,1,1,2,1
//left handside for index 2--> 2 times 1 and rhs 3 times 1
//for lhs= i-0+i-2+i==> 2*i+(sum of index)
//for rhs= 4-i+5-i+7-i==> (sum of index-(3*i))
class Solution {
    public long[] distance(int[] nums) {
        int n=nums.length;
        long[] res=new long[n];
        HashMap<Integer,ArrayList<Integer>> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            hm.putIfAbsent(nums[i],new ArrayList<>());
            hm.get(nums[i]).add(i);
        }
        for(ArrayList<Integer> l:hm.values()){
            long sumL=0;
            long countL=0;
            int size=l.size();
            long total=0;
            for(int i:l) total+=i;
            long sumR=total;
            long countR=size;
            for(int j=0;j<size;j++){
                int idx=l.get(j);
                sumR-=idx;
                countR--;
                long left=countL*idx-sumL;
                long right=sumR-countR*idx;
                res[idx]=left+right;
                sumL+=idx;
                countL++;
            } 
        }
        return res;
    }
}