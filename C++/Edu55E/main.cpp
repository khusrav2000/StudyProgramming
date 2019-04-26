
//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
int dp[100];
int mod = 1e9 + 7 ;
int main() {
    ios_base::sync_with_stdio(0);
    double em;
    cout << "e/m: ";
    cin >> em ;
    double bkr;
    cout << "Bkr: ";
    cin >> bkr;
    double Ua;
    cout <<"Ua: ";
    cin >> Ua;
    cout << sqrt((em * 6.0 / bkr / 10000) * (em * 6.0 / bkr / 10000) + (em * 0.0333 / Ua));
}