//
// Created by KHUSRAV on 02.02.2019.
//


//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
bool chek(string a , string b){
    //cout << a <<" "<<b <<'\n';
    if(a[0] != '+')
        a = '+' + a;
    bool skob = false;
    for(int i = 0 ; i < a.size() ; i++)
        if(a[i] == '(')
            skob = true ;
    int l = 0 ;
    int r = 0 ;
    while ( l < a.size() && r < b.size()){
        if(a[l] == b[r]){
            l ++ ;
            r ++ ;
        } else{
            if(b[r] == 'X')
                l++ , r++;
            else if(b[r] == ' ')
                r ++ ;
            else{
                if((b[r] == '(' || b[r] == ')') && skob == false)
                    r ++ ;
                else return 0;
            }
        }
    }
    if(b[r + 1] == '-')
        return 1;
    return 0;
}
string getCorrectFormat(string a , string b){
    int l = 0 ;
    string ans ;
    while( b[l] != 'X' && b[l] != '-'){
        ans += b[l];
        l ++ ;
    }
    string o = "";
    while(b[l] == 'X'){
        o += a.back();
        a.pop_back();
        l ++ ;
    }
    reverse(o.begin() , o.end());
    ans += o ;
    for(int i = l ; i < b.size() ; i++)
        ans += b[i];
    return ans ;
}
int main() {
    int N , M ;
    cin >> N ;

    string s[1001] , c[1001] , a;
    getline(cin , a);
    for(int i = 0 ; i < N ; i ++){
        getline(cin , a);

        c[i] = "";
        for(int j = 0 ; j < a.size() ; j++){
            if(a[j] != ' ' && a[j] != '-')
                c[i] += a[j];
        }

    }
    cin >> M ;
    getline(cin , a);
    for(int i = 0 ; i < M ; i++){
        getline(cin , s[i]);

    }
    // cout << - 1 <<'\n';
    for(int i = 0 ; i < N ; i++){
        for(int j = 0 ; j < M ; j++){
            //cout << c[i] <<" "<<s[j] <<" "<<chek(c[i] , s[j])<<'\n';
            if(chek(c[i] , s[j]) == 1){
                cout << getCorrectFormat(c[i] , s[j])<<'\n';
                j = M + 1 ;
            }
        }
    }
    return 0;
}