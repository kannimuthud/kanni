#include <iostream>
using namespace std;

int main() {
    int n,i,j,k=1,o,oo=0;
    cin>>n;
    for(i=0;i<n;i++)
    {
        if(i%2==0)
        {
            for(j=0;j<n;j++)
            {
                cout<<k++<<" ";
            }
        }
        else
        {
            oo=k+n-1;
         for(o=n;o>0;o--)
         {
             cout<<oo--<<" ";
         }
         k=k+n;
        }
    cout<<"\n";
    }
	return 0;
}
