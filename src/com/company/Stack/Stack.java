package com.company.Stack;

public class Stack {
    private int myStack[];
    private int top;
    private int stackCapacity;

    //creating Stack
    Stack(int size){
        myStack = new int[size];
        stackCapacity = size;
        top = -1;

    }

    //Add elements on to the Stack
    public  void  push(int x){
        if(isFull()){
            System.out.println("Stack Overflow \n The program has been terminated");
            System.exit(1);
        }
        System.out.println("Inserting element: " +x);
        myStack[++top] = x;
    }

    //Remove element from a stack
    public int pop() {
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return  myStack[top--];
    }

    //Returning the size of the stack
    public  int size(){
        return top +1;
    }

    //checking if the stack is empty
    private boolean isEmpty() {
        return  top == -1;
    }

    //checking if the Stack isFull
    public Boolean isFull(){
        return  top == stackCapacity - 1;
    }

    //printing the elements of the stack
    public void printStack(){
        for(int i = 0; i<= top; i++){
            System.out.println(myStack[i]);
        }
    }


}
