class Solution {
    public int minMutation(String startGene, String endGene, String[] bank) {
        if(startGene.equals(endGene)){
            return 0;
        }
        HashSet<String> s=new HashSet<>(Arrays.asList(bank));
        if(!s.contains(endGene)) return -1;
        Queue<String> q=new LinkedList<>();
        q.add(startGene);
        int res=0;
        char[] allow={'A','C','G','T'};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String cur=q.poll();
                if(cur.equals(endGene)) return res;
                char[] gene=cur.toCharArray();
                for(int j=0;j<gene.length;j++){
                    char x=gene[j];
                    for (char c:allow) {
                        gene[j]=c;
                        String next=new String(gene);
                        if (s.contains(next)) {
                            q.offer(next);
                            s.remove(next);
                        }
                    }
                    gene[j]=x;
                }
            }
            res++;
        }
        return -1;
    }
}