#include <iostream>
#include <set>
#include <vector>

int main() {
    int x, n;
    std::cin >> x >> n;
    
    std::vector<int> positions(n);
    for (int i = 0; i < n; ++i) {
        std::cin >> positions[i];
    }
    
    std::set<int> trafficLights;
    std::multiset<int> segments;
    
    trafficLights.insert(0);
    trafficLights.insert(x);
    segments.insert(x);
    
    for (int i = 0; i < n; ++i) {
        int pos = positions[i];
        
        auto it = trafficLights.lower_bound(pos);
        int right = *it;
        int left = *std::prev(it);
        
        segments.erase(segments.find(right - left));
        
        segments.insert(pos - left);
        segments.insert(right - pos);
        
        trafficLights.insert(pos);
        
        std::cout << *segments.rbegin() << " ";
    }
    
    return 0;
}
