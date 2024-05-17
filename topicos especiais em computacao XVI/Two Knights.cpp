#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;

    for (int k = 1; k <= n; ++k) {
        long long total_positions = (long long)k * k;
        long long total_ways = total_positions * (total_positions - 1) / 2;
        
        long long attack_ways = 0;
        if (k > 2) {
            attack_ways = 4 * (k - 1) * (k - 2);
        }
        
        long long non_attack_ways = total_ways - attack_ways;
        cout << non_attack_ways << endl;
    }
    
    return 0;
}
