#include <bits/stdc++.h>
using namespace std;
map<char , int> used ;
int main() {
    int x , y , dp[101];
    cin >> x >> y ;
    for(int i = 1 ; i<= y ; i++)
        dp[i] = 1e9;
    dp[x] = 0;
    for(int i = x + 1 ; i <= y; i++){
        if(i - 3 >= 0 && dp[i - 3] != 1e9)
            dp[i] = min(dp[i] , dp[i - 3] + 1);
        if(i % 4 == 0 && dp[i / 4] != 1e9)
            dp[i] = min(dp[i] , dp[i / 4] + 1);
    }
    if(dp[y] == 1e9)
        dp[y] = -1;
    cout << dp[y];
    return 0;
}