package implementation.main;

import implementation.MyStack;

public class MyMain {
    public static void main(String[] args) {
        // capacity of stack
        int capacity=5;
        // Create stack ,by creating instance of myStack
        MyStack myStack=new MyStack(capacity);
        myStack.pop();
        myStack.peek();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        System.out.println("Size of Stack :" +myStack.size());
        myStack.push(40);
        myStack.push(50);
        myStack.push(60);
        myStack.traverse();
        System.out.println("Searching 20 in Stack ,found = "+myStack.search(20));


    }
}
