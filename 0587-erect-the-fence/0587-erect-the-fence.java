class Solution {
    public int[][] outerTrees(int[][] trees) {
        int n=trees.length;
        Arrays.sort(trees,(a,b)->{
            if(a[0]==b[0]){
                return a[1]-b[1];
            }
            return a[0]-b[0];
        });
        Deque<int[]> upper=new ArrayDeque<>();
        Deque<int[]> lower=new ArrayDeque<>();
        for(int[] p:trees){
            while(lower.size()>=2){
                int[] p2=lower.removeLast();
                int[] p1=lower.peekLast();
                if(eqValue(p1,p2,p)<0){
                    continue;
                }
                lower.addLast(p2);
                break;
            }
            
            while(upper.size()>=2){
                int[] p2=upper.removeLast();
                int[] p1=upper.peekLast();
                if(eqValue(p1,p2,p)>0){
                    continue;
                }
                upper.addLast(p2);
                break;
            }
            lower.addLast(p);
            upper.addLast(p);
        }
        Set<String> st=new HashSet<>();
        for(int[] x:upper){
            st.add(x[0]+","+x[1]);
        }
        for(int[] x:lower){
            st.add(x[0]+","+x[1]);
        }
        int size=st.size();
        int[][] res=new int[size][2];
        int i=0;
        for(String s:st){
            String[] sp=s.split(",");
            res[i][0]=Integer.parseInt(sp[0]);
            res[i][1]=Integer.parseInt(sp[1]);
            i++;
        }
        return res;

    }
    public int eqValue(int[] p1,int[] p2,int[] p3){
        int x1=p1[0];
        int x2=p2[0];
        int x3=p3[0];
        int y1=p1[1];
        int y2=p2[1];
        int y3=p3[1];
        return (y3-y2)*(x2-x1)-(y2-y1)*(x3-x2);

    }
}