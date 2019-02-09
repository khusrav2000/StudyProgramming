//
// Created by KHUSRAV on 02.02.2019.
//


//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
map<string , map<string , int > > used ;
map<string , int> color ;
int main() {
    int T , n , ans = 0 ;
    string s ;
    cin >> T ;
    vector<pair<string , string >> verr;
    for(int i = 1 ; i <= T ; i++){
        cin >> s ;
        n = s.size() - 2 ;
        string w[n + 1];
        for(int j = 0 ; j < n ; j ++){
            w[j] = "";
            w[j] += s[j];
            w[j] += s[j + 1];
            w[j] += s[j + 2];
            if(color[w[j]] == 0){
                ans ++ ;
                color[w[j]] = 1 ;
            }
            //cout << s<<" "<<s[j] <<" "<<s[j + 1] <<" "<<s[j + 2] <<" "<<w[j]<<'\n';
        }
        for(int j = 0 ; j < n - 1 ; j ++){
            if(used[w[j]][w[j + 1]] == 0){
                verr.push_back({w[j] , w[j + 1]});
            }
            used[w[j]][w[j + 1]] ++ ;
        }
    }
    cout << ans <<'\n';
    cout << verr.size()<<'\n';
    for(int i = 0 ; i < verr.size() ; i ++){
        cout << verr[i].first <<" "<<verr[i].second <<" "<<used[verr[i].first][verr[i].second]<<'\n';
    }
    return 0;
}