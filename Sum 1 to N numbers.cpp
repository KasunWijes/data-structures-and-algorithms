#include <stdio.h>
#include <iostream>
#include <iostream>
using namespace std;
//Summation of numbers 1 to n through Recurssion

//int count = 0; //count initialization out of fun scope

int sum (int n)
{
    
    if (n==0) return 0;   //no semicolan after if conditions
    return n + sum(n-1);
    
    //printf(i);  //cout is a output stream while printf is a function. cout is used only by c++ while printf can be used by both c and c++
//   // count++;
//    printf(i);
//    fun(i+1,n);  //recurssion
    
}

int main()
{
	int n=3;
	cout << sum(n);

}
