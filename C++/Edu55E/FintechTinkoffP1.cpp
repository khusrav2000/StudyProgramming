//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
int main() {
    int x ;
    cin >> x ;
    int ans = min(9 , x );
    for(int i = 1 ; i <= 1000 ; i ++){
        int y = i ;
        int s = i ;
        while(y > 0){
            s = s * 10 + y % 10 ;
            y = y / 10;
        }
        if(s <= x) {
            ans++;
            cout << s<<'\n';
        }
        for(int j = 0 ; j<= 9 ; j ++){
            s = i * 10 + j ;
            y = i ;
            while(y > 0){
                s = s * 10 + y % 10 ;
                y = y / 10;
            }
            if(s <= x) {
                ans++;
                cout << s<<'\n';
            }
        }

    }
    cout << ans ;
    return 0;
}