//
// Created by KHUSRAV on 19.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
int main() {
    int a , b , c , mx= 0 ;
    cin >> a >> b >> c ;
    if(a + 1 <= b && a + 2 <= c){
        mx = max(mx , a + a + a + 1 + 2);
    }
    else if(b - 1 <= a && b + 1 <= c){
        mx = max(mx , b - 1 + b + b + 1) ;
    }
    else if(c - 1 <= b && c - 2 <= a){
        mx = max(mx , c + c - 1 + c - 2) ;
    }
    cout << mx ;
    return 0;
}