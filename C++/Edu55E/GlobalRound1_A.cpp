
//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
int main() {
    int b , k , a[100001];
    cin >> b >> k ;
    for(int i = 0 ; i < k ; i ++)
        cin >> a[i];
    int p = 1 , ans = 0 ;
    for(int i = k - 1 ; i >=0 ; i--){
        ans = (ans + (p * a[i]) % 2) % 2 ;
        p = (p * b) % 2 ;
    }
    if(ans == 0)
        cout << "even";
    else cout << "odd";
}