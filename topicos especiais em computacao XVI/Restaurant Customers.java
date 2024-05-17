#include <iostream>
#include <vector>
#include <algorithm>
using namespace std;

struct Event {
    int time;
    int type; // 1 for arrival, -1 for departure

    bool operator<(const Event& other) const {
        if (time == other.time) {
            return type < other.type; 
        }
        return time < other.time;
    }
};

int main() {
    int n;
    cin >> n;
    
    vector<Event> events;
    for (int i = 0; i < n; ++i) {
        int arrival, departure;
        cin >> arrival >> departure;
        events.push_back({arrival, 1});
        events.push_back({departure, -1});
    }

    sort(events.begin(), events.end());

    int currentCustomers = 0;
    int maxCustomers = 0;
    for (const auto& event : events) {
        currentCustomers += event.type;
        if (currentCustomers > maxCustomers) {
            maxCustomers = currentCustomers;
        }
    }

    cout << maxCustomers << endl;

    return 0;
}
