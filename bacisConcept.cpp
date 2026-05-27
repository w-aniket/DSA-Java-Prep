#include <iostream>
using namespace std;
 int main() {

    int i = 10; // Variable declaration
    cout << "i = " << i << endl;

    int j = i; // Copy of variable i
    j = 12;
    cout << "j = " << j << endl;
    cout << "i = " << i << endl;

    int *l = &i; // Address of variable i
    cout << "l = " << l << endl;

    int &n = i; // Reference of variable i (Both point to the same memory location)
    n = 11;
    cout << "n = " << n << endl;
    cout << "i = " << i << endl;

    int &p = *l; // Value that stored in the address
    cout << "p = " << p << endl;

   int a = 'a'; // ASCII code of a
   cout << "a = " << a << endl;
    return 0;
 }