/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 04.04.17
 * Sets the blue print for creating a queue collection
 */

// TODO: comment out package chapter21
package chapter21;

// TODO: comment in package stacksAndQueues
//package stacksAndQueues;

public class QueueCollection<T> {
  
  private T[] q;                             // an array implemented as a queue
  private int front;                         // points to the front of the queue
  private int rear;                          // points to the rear of the queue
  private int size;                          // the size of the queue
  
  // CONSTRUCTORS
  
  public QueueCollection( int capacity ) {
    
    q = (T[]) new Object[capacity];          // initialize the array to a type of T
    front = 0;                               // initialize the front of the queue to 0
    rear = 0;                                // initialize the rear of the queue to 0
    size = 0;                                // initialize the size of the queue to 0
  }
  
  // METHODS
  
  /**
   * capacity() finds the length of an array implementing a queue
   *
   * @return length of the array
   */
  public int capacity() {
    
    return q.length;
  }
  
  /**
   * enqueue() adds an element to an array implementing a queue
   *
   * @param elem the element to be added to the queue
   * @throws QueueOverFlowException when the queue is full
   */
  public void enqueue( T elem ) {
    
    if( size == q.length ) {
      throw new QueueOverFlowException( "Cannot add an element to a full queue." );
    } else {
      // add element to rear and increase the size.
      size++;
      q[rear] = elem;
      rear++;
      
      // wrap rear pointer to beginning of queue
      if( rear == q.length ) {
        rear = 0;
      }
    }
  }
  
  /**
   * peek() returns the front element in the queue
   *
   * @return the front element of the queue
   *
   * @throws EmptyQueueException when the queue is empty
   */
  public T peek() {
    
    if( empty() ) {
      throw new EmptyQueueException( "Cannot find an element in an empty queue." );
    } else {
      return q[front];
    }
  }
  
  /**
   * dequeue() deletes the element at the front of the queue
   *
   * @return the first element of the queue
   *
   * @throws EmptyQueueException when the queue is empty
   */
  public T dequeue() {
    
    if( empty() ) {
      throw new EmptyQueueException( "Cannot delete element from an empty queue." );
    } else {
      
      // delete element and decrease the size
      size--;
      
      T value = q[front];
      q[front] = null;
      
      front++;
      
      // wrap the index front
      if( front == q.length ) {
        front = 0;
      }
      
      return value;
    }
  }
  
  /**
   * empty() checks to see if queue is empty
   * @return true if queue is empty or false otherwise
   */
  public boolean empty() {
    
    return size == 0;
  }
  
  
}
