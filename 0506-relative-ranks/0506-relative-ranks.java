class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] ans = new String[n];
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = score[i];
            pairs[i][1] = i;
        }
        Arrays.sort(pairs, (a, b) -> Integer.compare(b[0], a[0]));
        for (int rank = 0; rank < n; rank++) {
            int originalIndex = pairs[rank][1];
            if (rank == 0) {
                ans[originalIndex] = "Gold Medal";
            } else if (rank == 1) {
                ans[originalIndex] = "Silver Medal";
            } else if (rank == 2) {
                ans[originalIndex] = "Bronze Medal";
            } else {
                ans[originalIndex] = String.valueOf(rank + 1);
            }
        }
        return ans;
    }
}