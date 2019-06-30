#include <iostream>
using namespace std;

int main() {
    int n,i,j,c=0;
	cin>>n;
	for(i=0;i<n;i++)
	{
	    for(j=0;j<n;j++)
	    {
	        if (i>=j)
	        {
	            cout<<c++;
	        }
	       
	         else
	        {
	            cout<<" ";
	        }
	         if(i!=0 and i!=j and i>=j)
	        {
	         cout<<"*";   
	        }
	    }
	    cout<<"\n";
	}
	return 0;
}
