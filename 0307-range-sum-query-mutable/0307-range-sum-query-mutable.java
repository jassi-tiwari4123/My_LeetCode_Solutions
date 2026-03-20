class NumArray {
    int n;
    int[] seg;
    public NumArray(int[] nums) {
        n=nums.length;
        seg=new int[4*n];
        build(0,0,n-1,nums);
    }
    public void build(int idx,int l,int r,int[] nums){
        if(l==r){
            seg[idx]=nums[l];
            return;
        }
        int mid=l+(r-l)/2;
        build(2*idx+1,l,mid,nums);
        build(2*idx+2,mid+1,r,nums);
        seg[idx]=seg[2*idx+1]+seg[2*idx+2];
    }
    public void update(int index, int val) {
        updateQ(0,0,n-1,index,val);
    }
    public void updateQ(int idx,int l,int r,int i,int nv){
        if(l==r){
            seg[idx]=nv;
            return;
        }
        int mid=l+(r-l)/2;
        if(i<=mid){
            updateQ(2*idx+1,l,mid,i,nv);
        }
        else{
            updateQ(2*idx+2,mid+1,r,i,nv);
        }
        seg[idx]=seg[2*idx+1]+seg[2*idx+2];
    }
    
    public int sumRange(int left, int right) {
        return query(0,0,n-1,left,right);
    }
    public int query(int idx,int l,int r,int ql,int qr){
        if(r<ql || l>qr){
            return 0;
        }
        if(l>=ql && r<=qr){
            return seg[idx];
        }
        int mid=l+(r-l)/2;
        int left=query(2*idx+1,l,mid,ql,qr);
        int right=query(2*idx+2,mid+1,r,ql,qr);
        return left+right;
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * obj.update(index,val);
 * int param_2 = obj.sumRange(left,right);
 */