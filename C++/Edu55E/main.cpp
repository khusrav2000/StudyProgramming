#include <bits/stdc++.h>
using namespace std;
int n , border[5001];
char a[5001][251];
int x , y , lines , colums;
int main() {
    //ios_base::sync_with_stdio(0);
    cin >> n;
    for(int i = 1 ; i <= n ; i++){
        cin >> x >> y ;

        int beg = 199; // начало ёлки
        int leftborder[5001] , k = 0;
        for(int j = y ; j <= y + x - 1; j++){ // обход ёлок с их высотами

            for(int l = 1 ; l <= j ; l++){ // очередная ёлка
                k ++ ;
                leftborder[k] = beg - l + 1;
            }
        }
        lines = max(lines , k);
        int offseats = 1e9;// на сколько можно передвинут эту ёлку влева
        for(int j = 1 ; j <= k ; j++){
            offseats = min(offseats , leftborder[j] - border[j] - 1);
        }
        beg -= offseats;
        k = 0;
        //cout << beg <<'\n';
        for(int j = y ; j <= y + x - 1; j++){ // обход ёлок с их высотами
            //cout <<"YES"<<'\n';
            for(int l = 1 ; l <= j ; l++){ // очередная ёлка
                k ++ ;
                border[k] = beg + l;
                border[k - 1] = max(border[k - 1] , border[k]);
                border[k + 1] = max(border[k + 1] , border[k]);
                colums = max(colums , border[k] - 1);
                colums = max(colums , border[k - 1] - 1);
                colums = max(colums , border[k + 1] - 1);
                for(int r = beg - l + 1 ; r <= beg + l - 1 ; r ++){
                    a[k][r] = '#';
                }
            }
        }
    }
    //cout << lines <<" "<<colums<<'\n';
    for(int i = 1 ; i <= lines ; i++){
        for(int j = 1 ; j <= colums ; j++){
            if(a[i][j] == '#')
                cout <<'#';
            else cout <<'.';
        }
        cout <<'\n';
    }

}