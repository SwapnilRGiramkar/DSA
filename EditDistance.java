//EditDistance
package basicDSA;

public class EditDistance {
    public static void main(String[] args) {
        String word1 = "";
        String word2 = "a";
        int ans = minDistance(word1, word2);
        System.out.println(ans); // Expected: 5
    }

    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        // dp[i][j] = min operations to convert word1[0..i-1] → word2[0..j-1]
        int[][] dp = new int[m + 1][n + 1];

        // Base case: if one word is empty
        for (int i = 0; i <= m; i++) dp[i][0] = i; // delete all
        for (int j = 0; j <= n; j++) dp[0][j] = j; // insert all

        // Fill dp table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1]; // no operation needed
                } else {
                    dp[i][j] = 1 + Math.min(
                        dp[i - 1][j - 1], // replace
                        Math.min(
                            dp[i - 1][j],   // delete
                            dp[i][j - 1]    // insert
                        )
                    );
                }
            }
        }

        return dp[m][n];
    }
}

