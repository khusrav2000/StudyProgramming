//
// Created by KHUSRAV on 09.02.2019.
//



#include <bits/stdc++.h>
using namespace std;
int dp[100];
int main() {
    ios_base::sync_with_stdio(0);
    int q , a[100001];
    cin >> q;
    for(int i = 0 ; i < q ; i ++){
        cin >> a[i];
    }
    for(int i = 0 ; i < q ; i ++){
        int b = a[i];
        int t = 0 , k = 0 ;
        while(b > 0){
            if(b % 2 == 0)
                t = 1 ;
            b = b / 2 ;
            k ++ ;
        }
        if(t == 1){
            cout << (1 << k) - 1 ;
        }
        else{
            int mx = 1 ;
            for(int j = 2; j * j < a[i] ; j++){
                if(a[i] % j == 0) {
                    mx = a[i] / j;
                    break;
                }
            }
            cout << mx ;
        }
        cout <<'\n';
    }
}