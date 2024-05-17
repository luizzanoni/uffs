#include <iostream>
#include <vector>
#include <unordered_set>
using namespace std;

const int MOD = 1000000007;

int main() {
    int n, m;
    cin >> n >> m;

    vector<vector<int>> dp(n + 1, vector<int>(n + 1, 0));
    unordered_set<long long> traps;

    for (int i = 0; i < m; ++i) {
        int y, x;
        cin >> y >> x;
        traps.insert((long long)y * (n + 1) + x); // Unique identifier for traps
    }

    dp[1][1] = 1; // Start point

    for (int i = 1; i <= n; ++i) {
        for (int j = 1; j <= n; ++j) {
            if (i == 1 && j == 1) continue; // Skip the start point
            if (traps.find((long long)i * (n + 1) + j) != traps.end()) continue; // Skip trap cells

            if (i > 1) dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD; // From the top
            if (j > 1) dp[i][j] = (dp[i][j] + dp[i][j - 1]) % MOD; // From the left
        }
    }

    cout << dp[n][n] << endl;

    return 0;
}
