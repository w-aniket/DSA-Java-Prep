#include <iostream>
using namespace std;

void findLargest(int arr[], int size)
{
    int largest = INT_MIN;
    for (int i = 0; i < size; i++)
    {
        if (arr[i] > largest)
        {
            largest = arr[i];
        }
    }

    cout << "Largest Element = " << largest << endl;
}

void reverseArray(int arr[], int size)
{
    for (int i = 0; i < size / 2; i++)
    {
        int temp = arr[i];
        arr[i] = arr[size - 1 - i];
        arr[size - 1 -i ] = temp;
    }

}

void rotation (int arr[], int size) {
    int temp = arr[size - 1];
    for (int i = size - 1; i >= 0; i--) {
        arr[i] = arr[i - 1];
    }
    arr[0] = temp;
}

void insertion (int arr[], int size, int value, int index){
    int end = size - 1;
    for (int i = end; i > index; i--)
    {
        arr[i] = arr[i -1];
    }
    arr[index] = value  ;
}
void deletion (int arr[], int size, int index){
    for (int i = index; i < size; i++)
    {
        arr[i] = arr[i + 1];
    }
}

void display(int arr[], int size){
    for (int i = 0; i < size; i++)
    {
        cout << arr[i] <<", ";
    }
    cout << endl;
}


int main()
{
    int arr[10] = {5, 3, 9, 8, 2, 7, 10};
    int size = sizeof(arr) / sizeof(arr[0]);

    // findLargest(arr, size);
    // reverseArray(arr, size);
    // rotation(arr, size);
    // display(arr, size);
    // insertion(arr, size, 13, 3);
    // display(arr, size);
    deletion(arr, size, 1);
    display(arr, size);
    
    return 0;
}