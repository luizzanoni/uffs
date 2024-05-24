#include <iostream>
#include <vector>
#include <set>

int main() {
    int n;
    std::cin >> n;
    
    std::vector<int> cubes(n);
    for (int i = 0; i < n; ++i) {
        std::cin >> cubes[i];
    }
    
    std::multiset<int> towers;
    
    for (int cube : cubes) {
        auto it = towers.upper_bound(cube);
        if (it != towers.end()) {
            towers.erase(it);
        }
        towers.insert(cube);
    }
    
    std::cout << towers.size() << std::endl;
    
    return 0;
}
