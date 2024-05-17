#include <iostream>
using namespace std;
 
long long findNumberInSpiral(int y, int x) {
    long long max_num = max(x, y);
    long long corner_num = max_num * max_num;
    long long result;
 
    if (max_num == y) {
        if (max_num % 2 == 0) {
            result = corner_num - (x - 1);
        } else {
            result = corner_num - (2 * max_num - 1) + x;
        }
    } else {
        if (max_num % 2 == 0) {
            result = corner_num - (2 * max_num - 1) + y;
        } else {
            result = corner_num - (y - 1);
        }
    }
    return result;
}
 
int main() {
    int t;
    cin >> t;
 
    while (t--) {
        int y, x;
        cin >> y >> x;
        cout << findNumberInSpiral(y, x) << endl;
    }
 
    return 0;
}