//
// Created by KHUSRAV on 09.02.2019.
//


//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
long long l , r , K ;
map<long long , long long> usnechet , uschet , color ;
deque<pair<long long , long long> > dq ;
int main() {
    long long n , k , t;
    cin >> n >> k ;
    dq.push_back({n , 0ll});
    uschet[n] = 1 ;
    usnechet[n] = 0 ;
    while(dq.size() > 0){
        n = dq[0].first;
        t = dq[0].second;
        //cout << n <<'\n';
        if((k - t) % 2 == 0){
            l += 1 ;
            if(n % 5 == 0 || n % 6 == 0 || n % 10 == 0)
                r += 1  ;
            color[n] = 1 ;

        }
        dq.pop_front();
        int a[101];
        long long x = 0 ;
        while (n > 0){
            a[x] = n % 10 ;
            n = n / 10 ;
            x ++ ;
        }
        reverse(a , a + x);
        for(int i = 0 ; i < x ; i++){
            for(int j = 0 ; j < x && i != j; j ++){
                swap(a[i] , a[j]);
                int N = 0 ;
                for(int g = 0 ; g < x ; g ++)
                    N = N * 10 + a[g];
                swap(a[i] , a[j]);

                if((t + 1) % 2 == 1){
                    if(usnechet[N] == 0 && t + 1 <= k) {
                        dq.push_back({N , t + 1});
                        usnechet[N] = 1 ;
                    }
                }
                else{
                    if(uschet[N] == 0 && t + 1 <= k){
                        dq.push_back({N , t + 1});
                        uschet[N] = 1 ;
                    }
                }
            }
        }
    }
    cout << fixed<<setprecision(16) << (1.0 * r) / (1.0 * l);
    return 0;
}