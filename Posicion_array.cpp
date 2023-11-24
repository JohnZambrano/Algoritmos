#include <bits/stdc++.h>

using namespace std;

int main(){
    char v[6], v2[6];

    for(int i=0; i<6; i++){
        cin>>v[i];
        v2[5-i]= v[i];    }

     for(int i=0; i<6; i++){

        cout<<"El vector 1 tiene el elemento "<<v[i]<<" en la posicion: "<<i<<endl;

    }
    for(int i=0; i<6; i++){

        cout<<"El vector 2 tiene el elemento "<<v2[i]<<" en la posicion: "<<i<<endl;
    }
 }
