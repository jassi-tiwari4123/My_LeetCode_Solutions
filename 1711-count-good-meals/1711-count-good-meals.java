class Solution {
    public int countPairs(int[] arr) {
        int MOD = 1_000_000_007;
        HashMap<Integer, Integer> map = new HashMap<>();
        long res = 0;

        for (int x : arr) {
            int power = 1;
            // Loop through powers of 2 up to 2^21
            for (int i = 0; i <= 21; i++) {
                int need = power - x;
                if (map.containsKey(need)) {
                    res = (res + map.get(need)) % MOD;
                }
                power <<= 1; // equivalent to 2^i
            }
            // Add current number to map
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        return (int) res;
    }
}
