
//
// Created by KHUSRAV on 24.01.2019.
//

#include <bits/stdc++.h>
using namespace std;
int dp[100];
int mod = 1e9 + 7 ;
int main() {
    ios_base::sync_with_stdio(0);
    double s =0.0 , f = 0.0 ;
    //double v[20] = {0, 0.5, 1, 1.3, 1.7, 1.9, 2.4, 2.6, 2.9, 3.3, 3.8};
    //double p[20] = {0 , -98.1 , -196.2 , -323.7, -441.5, -588.6, -687.7, -833.9, -981, -1079.1, -1177.2};
    double p[20] = {0 , -98.1, -245.25, -363 , -490.5 , -608.22, -735.8, -863.28, -981, -1108.53, -1226.25};
    double v[20] = {0, 0.5, 0.7, 1.1, 1.4, 1.8, 2.2, 2.5 , 2.9, 3.2 , 3.6};
    for (int i = 0 ; i < 11 ; i ++){
        f = f + p[i] * v[i];
        s = s + v[i] * v[i];
    }
    cout <<"Ev = "<<s<<'\n';
    double d[20];
    //double b = f / s;
    double b = -340.7;
    cout <<"b = "<<b<<'\n'<<'\n';
    for(int i = 0 ;i < 11 ; i ++){
        d[i] = p[i]-b*v[i];
        cout << "D"<<i + 1<<" = "<<p[i]<<" - "<<b<<"*"<<v[i]<<" = "<<d[i]<<'\n'<<'\n';
    }
    double g = 0.0 , h = 0.0;
    for(int i = 0 ; i < 11 ; i ++){
        g = g + (d[i] * d[i]);
        h = h + (v[i] * v[i]);
    }
    double Sb = g / h ;
    cout << "Ed = "<<g<<'\n';
    cout << "Ev = "<<h<<'\n';
    cout << "Sb^2 = 1/10 *"<<Sb<<'\n';
}