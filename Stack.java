
class MyStack {
    int[] arr;
    int top, cap;

    MyStack (int size){
        arr = new int[size];
        cap = size;
        top = 0;
    }

    boolean isFull(){
        if(top == cap) {
            return true;
        } else {
            return false;
        } 
    }

    boolean isEmpty(){
        if(top == 0) {
            return true;
        } else {
            return false;
        } 
    }

    void push(int val){
        if(isFull()){
            System.out.println("Stack overflow");
        }else {
            arr[top] = val;
            top++;
        }
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }

    int peek() {
        if(isEmpty()){
            System.err.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }

    void display(){
        for(int i = 0; i < top; i++){
            System.err.print(arr[i] + " ");
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        MyStack st = new MyStack(5);
        // st.pop();
        st.push(5);
        st.push(3);
        st.push(4);
        // st.pop();
        st.push(1);
        st.push(16);
        st.push(6);
    }
}