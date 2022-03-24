package com.company.Queue;

public class Queue {
    int SIZE = 6;
    int [] items = new int[SIZE];
    int front, rear;

    Queue(){
        front = -1;
        rear = -1;
    }

    //check whether the queue is full
    boolean isFull(){
        if(front == 0 && rear == SIZE -1 ){
            return true;
        }
        return false;
    }

    //check whether the queue is empty
    boolean isEmpty(){
        if (front == -1){
            return true;
        }
        return false;
    }

    //adding element into the queue
    /*
    * First check if the queue is full,
    * set the front value to zero and
    *  increase the rear by index 1
    * */

    int enQueue(int newItem){
        if (isFull()){
            System.out.println("The queue is full");
        }else{
            front = 0;
            rear++;
            items[rear] = newItem;
            System.out.println(newItem + "Has Be Added to the Queue");

        }
        return 0;
    }

    //Dequeuing (removing elements from the queue)
    int deQueuing(){
        int newItem;
        if (isEmpty()){
            System.out.println("The Queue has No Item");
            return (-1);
        }else{
            newItem = items[front];
            if (front >= rear){
                front = -1;
                rear = -1;
            }

            //Now lets reset the Queue after deleting an element
            else {
                front ++;
            }
            System.out.println(newItem + "The Item Has been deleted");
            return (newItem);
        }

    }

    //Displaying the operations of the Array
    void showOperations() {
        /* Function to display elements of Queue */
        int i;
        if (isEmpty()) {
            System.out.println("The Queue is Empty");
        } else {
            System.out.println("\nQueues Front Index " + front);
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
                System.out.print(items[i] + "  ");

            System.out.println("\n Queues Rear index-> " + rear);
        }
    }





}
