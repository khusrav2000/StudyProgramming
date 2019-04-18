
//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
int dp[100];
int mod = 1e9 + 7 ;
int main() {
    ios_base::sync_with_stdio(0);
    freopen("filse/train.tsv" , "r" , stdin);
    bool o = false;
    int t = 0 ;
    double s =0.0 , a;
    for(;;){
        cin >> a ;
        t ++ ;

        if(t <= 100){
            s += a ;
            cout << a <<'\n';
        }
        else {
            cout << s;
            t = 0;
            return 0;
        }
    }
}