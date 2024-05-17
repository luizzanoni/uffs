#include <iostream>
#include <unordered_map>
#include <vector>

using namespace std;

int main() {
    int n, x;
    cin >> n >> x;
    vector<int> a(n);
    for (int i = 0; i < n; ++i) {
        cin >> a[i];
    }

    unordered_map<int, int> index_map;
    for (int i = 0; i < n; ++i) {
        int complement = x - a[i];
        if (index_map.find(complement) != index_map.end()) {
            cout << index_map[complement] + 1 << " " << i + 1 << endl;
            return 0;
        }
        index_map[a[i]] = i;
    }

    cout << "IMPOSSIBLE" << endl;
    return 0;
}
