//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
map<char , int> used ;
int main() {
    string a ;
    cin >> a ;
    for(int i = 0 ; i < a.size() ; i ++){
        used[a[i]] ++ ;
        if(used[a[i]] == 2)
            cout << a[i]<<" ";
    }
    return 0;
}