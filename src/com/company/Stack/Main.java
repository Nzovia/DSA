package com.company.Stack;

public class Main {

    public static void main(String[] args) {
	// Data Structures are of different types, Linear and Non-Linear.
        // Each type has different advantages and drawbacks However, non-linear data structures
        // are considered the best in solving algorithms

        System.out.println(".......................................");
        //Start with a Stack, is a linear data structure that follows LIFO principle
        /*
        * There are different operations that can be performed on a stack DS, and they include
        * Push - add element to the top of the stack
        * Pop - remove an element from the top of the stack
        * IsFull - check whether the Stack is full
        * Peek - print the topMost element in that Stack
        * IsEmpty - returns Boolean, checks whether the stack has zero element
        * */


        //create the object of the Stack element
        Stack stack = new Stack(5);

        //add elements to the stack
        stack.push(5);
        stack.push(10);
        stack.push(15);
        stack.push(20);

        //removing elements from the stack
        stack.pop();

        //Here you print Stack after removing an element at the top
        System.out.println("\n After Popping Out");
        stack.printStack();


    }
}
