#include <iostream>
#include <list>

int main() {
    int n;
    std::cin >> n;
    
    std::list<int> children;
    for (int i = 1; i <= n; ++i) {
        children.push_back(i);
    }
    
    auto it = children.begin();
    while (!children.empty()) {
        
        it = std::next(it);
        if (it == children.end()) {
            it = children.begin();
        }
        std::cout << *it << " ";
        
        it = children.erase(it);
        if (it == children.end()) {
            it = children.begin();
        }
    }
    
    return 0;
}
