class Solution {
    public int winningPlayerCount(int n, int[][] pick) {
        Map<Integer,int[]> hm=new HashMap<>();
        for(int[]p:pick) {
            int player=p[0];
            int color=p[1];
            hm.putIfAbsent(player,new int[11]);
            hm.get(player)[color]++;
        }
        int ans=0;
        for(int player:hm.keySet()) {
            int[] colors=hm.get(player);
            for(int cnt:colors){
                if(cnt>player) {
                    ans++;
                    break;
                }
            }
        }
        return ans;
    }
}