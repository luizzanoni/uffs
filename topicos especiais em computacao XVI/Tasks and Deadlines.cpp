#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct Task {
    int duration;
    int deadline;
};

bool compareTasks(const Task& t1, const Task& t2) {
    return t1.deadline < t2.deadline;
}

int main() {
    int n;
    cin >> n;

    vector<Task> tasks(n);
    for (int i = 0; i < n; ++i) {
        cin >> tasks[i].duration >> tasks[i].deadline;
    }

    sort(tasks.begin(), tasks.end(), compareTasks);

    long long currentTime = 0;
    long long totalReward = 0;

    for (const Task& task : tasks) {
        currentTime += task.duration;
        totalReward += (task.deadline - currentTime);
    }

    cout << totalReward << endl;

    return 0;
}
