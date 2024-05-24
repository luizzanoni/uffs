#include <iostream>
#include <list>

int main() {
    int n, k;
    std::cin >> n >> k;
    
    std::list<int> children;
    for (int i = 1; i <= n; ++i) {
        children.push_back(i);
    }
    
    auto it = children.begin();
    while (!children.empty()) {
        
        for (int i = 0; i < k; ++i) {
            ++it;
            if (it == children.end()) {
                it = children.begin();
            }
        }
        
        std::cout << *it << " ";
        it = children.erase(it);
        if (it == children.end()) {
            it = children.begin();
        }
    }
    
    return 0;
}
