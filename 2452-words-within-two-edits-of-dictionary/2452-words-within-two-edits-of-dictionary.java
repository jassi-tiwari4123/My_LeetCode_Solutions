class Solution {
    public List<String> twoEditWords(String[] q, String[] d) {
        List<String> res=new ArrayList<>();
        int n=q.length;
        int m=d.length;
        for(int i=0;i<n;i++){
            String s=q[i];
            int len=s.length();
            for(int j=0;j<m;j++){
                int count=0;
                for(int k=0;k<len;k++){
                    if(s.charAt(k)!=(d[j].charAt(k))){
                        count++;
                        if(count>2)
                        {
                            break;
                        }
                    }
                }
                if(count<=2){
                    res.add(s);
                    break;
                }
            }
        }
        return res;
    }
}