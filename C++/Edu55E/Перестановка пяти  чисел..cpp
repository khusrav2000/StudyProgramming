//
// Created by KHUSRAV on 02.01.2019.
//
#include<bits/stdc++.h>
using namespace std;
int main(){
    int s = 1 ;
    int a[] = {1 , 2 , 3 , 4 , 5};
    cout << s <<" - "<<a[0] <<" "<<a[1] <<" "<<a[2] <<" "<<a[3] <<" "<<a[4]<<'\n';
    while(next_permutation(a , a + 5)){
        s ++ ;
        cout << s <<" - "<<a[0] <<" "<<a[1] <<" "<<a[2] <<" "<<a[3] <<" "<<a[4]<<'\n';
    }
}

