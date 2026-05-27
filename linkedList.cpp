#include<iostream>
using namespace std;

class Node {
public:
    int data;
    Node* next;

    Node(int val){
        data = val;
        next = nullptr;
    }
};

class LinkedList {
public:
    Node* head;

    LinkedList(){
        head = nullptr;
    }

    void createLinkedList(int arr[], int size) {
        if(size == 0) return ;

        head = new Node(arr[0]);
        Node* temp = head;

        for(int i = 1; i < size; i++){
            temp->next = new Node(arr[i]);
            temp = temp->next;
        }
    }

    void display(Node* temp){
        while(temp != nullptr){
            cout << temp->data << " -> ";
            temp = temp-> next;
        }
        cout << "NULL\n";
    }

    void recursiveDisplay(Node* temp){
        if(temp == nullptr) {
            cout << "NULL -> ";
            return;
        };

        cout << temp->data << " -> ";
        recursiveDisplay(temp-> next);
    }

    Node* reverceLinkedList(Node* temp){
        Node* prev = nullptr, * next = nullptr;
        while(temp != nullptr){
            next = temp->next;
            temp->next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

};



int main() {
     int arr[] = {10, 20, 30, 40, 50};
     int size = sizeof(arr) / sizeof(arr[0]);

     LinkedList list;
    list.createLinkedList(arr, size);
    // list.display(list.head);
    // list.recursiveDisplay(list.head);
    list.display(list.reverceLinkedList(list.head));
    return 0;
}