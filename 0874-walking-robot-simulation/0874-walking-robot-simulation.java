import java.util.*;

class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int x = 0, y = 0;
        int dir = 0; // 0=N, 1=E, 2=S, 3=W

        int[][] directions = {
            {0,1},   // North
            {1,0},   // East
            {0,-1},  // South
            {-1,0}   // West
        };

        int maxDist = 0;

        for (int cmd : commands) {
            if (cmd == -1) {
                dir = (dir + 1) % 4;
            } 
            else if (cmd == -2) {
                dir = (dir + 3) % 4;
            } 
            else {
                for (int step = 0; step < cmd; step++) {
                    int nx = x + directions[dir][0];
                    int ny = y + directions[dir][1];

                    // 🔴 Brute force obstacle check
                    boolean blocked = false;
                    for (int[] obs : obstacles) {
                        if (obs[0] == nx && obs[1] == ny) {
                            blocked = true;
                            break;
                        }
                    }

                    if (blocked) break;

                    x = nx;
                    y = ny;

                    maxDist = Math.max(maxDist, x*x + y*y);
                }
            }
        }

        return maxDist;
    }
}