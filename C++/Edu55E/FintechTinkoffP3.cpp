//
// Created by KHUSRAV on 24.01.2019.
//


//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
vector<long long> ans ;
vector<long long> change (string a){
    vector<long long> stepInt(100);
    for(int i = 0 ; i < 100 ; i ++)
        stepInt[i] = 0 ;
    string s = "";
    a = "+" + a ;

    for(int i = a.size() - 1; i >= 0 ; i --){
        if(a[i] != '-' && a[i] != '+'){
            s += a[i];
        }
        else if(s.size() > 0){
            bool xH = false, sH = false;
            for(int j = 0 ; j < s.size() ; j ++){
                if(s[j] == 'x')
                    xH = true;
                if(s[j] == '^')
                    sH = true;
            }
            reverse(s.begin() , s.end());
            //cout << s <<" "<<xH <<" "<<sH<<'\n';
            if(!xH && !sH){
                int d = 0 ;
                for(int j = 0 ; j < s.size() ; j ++) {
                    d = d * 10 + int(s[j]) - 48 ;
                }
                if(a[i] == '+')
                    stepInt[0] += d ;
                else stepInt[0]-= d ;
            }
            else if(!sH){
                int d = 0 ;
                for(int j = 0 ; j < s.size() - 1 ; j ++) {
                    d = d * 10 + int(s[j]) - 48 ;
                }
                if(d == 0)
                    d = 1 ;
                if(a[i] == '+')
                    stepInt[1] += d ;
                else stepInt[1]-= d ;
            }
            else{
                int d = 0 , o = 0;
                for(int j = 0 ; j < s.size() ; j ++) {
                    if(s[j] == 'x' || s[j] == '^'){
                        o = d ;
                        d = 0 ;
                    }
                    else {
                        d = d * 10 + int(s[j]) - 48;
                    }
                }
                if(a[i] == '+')
                    stepInt[d] += o ;
                else stepInt[d]-= o ;
            }
            s = "";
        }
    }
    return stepInt;
}
int main() {
    string a , b ;
    cin >> a >> b ;
    vector<long long> aInt = change(a);
    vector<long long> bInt = change(b);
    cout << aInt[0]<<'\n';
    for(int i = 0 ; i < 40 ; i ++){
        for(int j = 0 ; j < 40 ; j ++){
            ans[i + j] += aInt[i] * bInt[j];
        }
    }
    cout << -1 <<'\n';
    cout << ans[2]<<'\n';
    string s = "";
    for(int i = 80 ; i > 0 ; i--){
        if(ans[i] != 0){
            cout << ans[i]<<'\n';
            if(ans[i] < 0)
                s += "-";
            else{
                if(s.size() > 0)
                    s += '+';
            }
            s += to_string(abs(ans[i]));
            s += "x^";
            s += to_string(i);
        }
    }
    cout << s ;
    return 0;
}