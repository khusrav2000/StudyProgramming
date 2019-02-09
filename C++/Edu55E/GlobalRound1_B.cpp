//
// Created by KHUSRAV on 09.02.2019.
//


//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
int main() {
    int n , m , k , ans = 0 , a[100001];
    vector<int> verr;
    cin >> n >> m >> k ;
    ans = n ;
    for(int i = 0 ; i < n ; i ++) {
        cin >> a[i];
    }
    for(int i = 1 ; i < n ; i ++){
        verr.push_back(a[i] - a[i - 1] - 1);
    }
    sort(verr.begin() , verr.end());
    reverse(verr.begin() , verr.end());
    while (n > k){

        ans = ans + verr.back();
        verr.pop_back();
        n -- ;
    }
    cout << ans ;
}