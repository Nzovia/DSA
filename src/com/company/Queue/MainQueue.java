package com.company.Queue;

public class MainQueue {
    /*
    * Queue is a data Structure that operates like the normal lines or queues on the
    *  waiting line
    * Queues has four major operations
    * enqueue -> add element to the  end of the queue
    * dequeue -> Removes an element from the front of the queue
    * is-empty -> checks if the queue is empty
    * isFull -> checks if the size of the queue is full
    * Peek ->  returns the value of the front-most item in the queue without removing it
    * */

    public static void main(String[] args) {
        Queue queue = new Queue();

        // deQueue is not possible on empty queue
        queue.deQueuing();

        // enQueue 5 elements
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);

        // 6th element can't be added to because the queue is full
        queue.enQueue(6);

        queue.showOperations();

        // deQueue removes element entered first i.e. 1
        queue.showOperations();

        // Now we have just 4 elements
        queue.showOperations();

    }


}
