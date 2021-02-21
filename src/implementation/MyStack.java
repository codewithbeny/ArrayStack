package implementation;

import MyInterface.MyStackADT;

public class MyStack implements MyStackADT {
    // Maximum of elements in stack
    private final int MAX_CAPACITY;
    // to store elements of stack
    private int[] arr;
    // top
    int top;

    public MyStack(int MAX_CAPACITY) {
        this.MAX_CAPACITY = MAX_CAPACITY;
        // constructor an array
        arr=new int[MAX_CAPACITY];
        top=-1;
    }

    @Override
    public void push(int element) {
        if(isFull()){
            top++;
            arr[top]=element;
            System.out.println("Element Inserted");
        }else{
            System.out.println("Stack Overflow");
        }
    }

    private boolean isFull() {
        return top != MAX_CAPACITY - 1;
    }

    @Override
    public int pop() {
        int response=0;
        if(!isEmpty()){
            response =arr[top];
            top--;
        }else{
            System.out.println("Stack Underflow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response=0;
        if(!isEmpty()){
            response=arr[top];
        }else{
            System.out.println("Stack is Empty");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        boolean response =false;
        if(top==-1){
            response =true;
        }
        return response;
    }

    @Override
    public int size() {
        return top + 1;
    }

    public void traverse(){
        for (int i = 0; i <=top; i++) {
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    public boolean search(int searchElement){
        boolean response=false;
        for (int i  = 0; i <=top ; i++) {
            if(arr[i]==searchElement){
                response=true;
                break;
            }
        }
        return response;
    }
}
