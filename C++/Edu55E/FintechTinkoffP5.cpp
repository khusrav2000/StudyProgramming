//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
map<char , int> used ;
int main() {
    int n , m , l[10001] , r[10001] , used[10001] ;
    cin >> n >> m ;
    for(int i = 1 ; i <= m ; i++){
        cin >> l[i] >> r[i] ;
        used[i] = 1 ;
        for(int j = 1 ; j < i ; j++){

            if(used[j] == 1){
                if(r[i] < l[j] || r[j] < l[i])
                    continue;
                else {
                    //cout << j<<'\n';
                    used[j] = 0;
                }
            }
        }
    }
    int s = 0 ;
    for(int i = 1 ; i <= m ; i++)
        s += used[i];
    cout << s ;
    return 0;
}