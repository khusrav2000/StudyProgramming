//
// Created by KHUSRAV on 02.02.2019.
//


//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
long long dp[1000001] , dpsi[1000001];
int main() {
    string s ;
    long long l = 0 , x[1000001];
    cin >> s ;
    string a = "";
    for(int i = 0 ; i < s.size() ; i ++){
        if(s[i] >= 'a' && s[i] <= 'z'){
            if(a.size() == 0){
                l ++ ;
                x[l] = 1 ;

            }
            else{
                long long p = 0 ;
                for(int j = 0 ; j < a.size() ; j ++){
                    p = p * 10 + int(a[j]) - 48 ;
                }
                l ++ ;
                x[l] = p ;

            }
            a = "";
        } else{
            a += s[i];
        }
    }
    int n = l;
    for(int i = 1; i <= n; i++){
        //cout << x[i]<< " ";
        dp[i] = dp[i - 1] + x[i] ;
        int digit = x[i] , si = 1;
        if(digit == 1)
            si = 1 ;
        else{
            while (digit > 0){
                si ++ ;
                digit /= 10 ;
            }
        }
        dpsi[i] = dpsi[i - 1] + si ;
        //cout << dp[i]<<" ";
    }
    //cout <<'\n';
    long long q ;
    cin >> q ;
    for (int i = 1 ; i <= q ; i ++) {
        long long lef , righ , leftIndex , rightIndex;
        cin >> lef >> righ ;
        l = 0;
        int r = n;
        while (l + 1 < r) {
            long long m = (l + r) / 2;
            if (dp[m] < lef) l = m ;
            else r = m ;
        }
        if(dp[r] < lef)
            l = r ;
        l ++ ;

        leftIndex = l;
        l = 0;
        r = n;
        while (l + 1 < r) {
            long long m = (l + r) / 2;
            if (dp[m] < righ) l = m ;
            else r = m ;
        }
        if(dp[r] < lef)
            l = r ;
        l ++ ;
        rightIndex = l;
        //cout << leftIndex <<" "<<rightIndex <<'\n';
        ////////////////////////////////
        long long ans = 0 ;
        if(rightIndex - leftIndex > 1){
            ans = dpsi[rightIndex - 1] - dpsi[leftIndex];
        }
        //cout << " ans = "<<ans <<'\n';
        if(rightIndex - leftIndex > 0) {
            long long y;
            lef = lef - dp[leftIndex - 1];
            y = x[leftIndex] - lef + 1 ;
            long long si = 1 ;
            if(y == 1)
                si = 1 ;
            else{
                while(y > 0){
                    y /= 10;
                    si ++ ;
                }
            }
            ans += si ;
            righ = righ - dp[rightIndex - 1];
            y = righ;
            si = 1 ;
            if(y == 1)
                si = 1 ;
            else{
                while(y > 0){
                    y /= 10;
                    si ++ ;
                }
            }
            ans += si ;
        }else{
            //cout <<" ravni "<<'\n';
            long long xx;
            lef = lef - dp[leftIndex - 1];
            long long  lef;
            long long yy;
            righ = righ - dp[rightIndex - 1];
            yy = righ;
            long long y = yy - xx + 1 ;
            long long si = 1 ;
            if(y == 1)
                si = 1 ;
            else{
                while(y > 0){
                    y /= 10;
                    si ++ ;
                }
            }
            ans += si ;
        }
        cout <<ans <<'\n';

    }

    return 0;
}