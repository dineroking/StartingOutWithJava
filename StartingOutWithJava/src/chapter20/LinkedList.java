/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 03.08.17
 * Sets the blue print for creating a linked list
 */
package chapter20;

/**
 * LinkedList class for creating a linked list
 * @param <T> The type to be held in the linked list
 */
public class LinkedList<T> {
  
  private class Node {
    
    // NODE VARIABLES
    
    T value;
    Node next;
    Node prev;
    
    
    
    // NODE CONSTRUCTORS
  
    /**
     * Node class that creates the nodes of the linked list
     * @param v value of the node
     * @param n points to the succeeding node
     * @param p points to the preceding node
     */
    Node( T v, Node n, Node p ) {
      
      value = v;
      next = n;
      prev = p;
      
    }
  
    /**
     * Node class creates the nodes od the linked list
     * @param v value of the node
     */
    Node( T v ) {
      
      // call the constructor with three arguments
      this( v, null, null );
    }
  }
  
  // LINKEDLIST VARIABLES
  
  private Node first;         // list head
  private Node last;          // last element in list
  
  
  
  // LINKEDLIST CONSTRUCTORS
  
  /**
   * LinkedList initializes the first and last variables to null
   */
  public LinkedList() {
    first = null;
    last = null;
  }
  
  
  
  // METHODS
  
  /**
   * isEmpty checks if the linked list is empty
   * @return true if linked list is empty or false otherwise
   */
  public boolean isEmpty(){
    return first == null;
  }
  
  /**
   * size checks for the number of elements in the linked list
   * @return the number of elements in the linked list
   */
  public int size() {
    int count = 0;
    Node p = first;
    while( p != null ) {
      
      count++;
      p = p.next;
    }
    return count;
  }
  
  /**
   * add adds an element to the end of the linked list
   * @param e the element to be added to the linked list
   */
  public void add( T e ) {
    
    if( isEmpty() ) {
      
      last = new Node( e );
      first = last;
    } else {
      
      last.next = new Node( e, null, last );
      last = last.next;
    }
  }
  
  /**
   * add adds element in a speified position in the linked list
   * @param index the position in which the element should be added
   * @param e the element to be added to the linked list
   */
  public void add( int index, T e ) {
    
    if( index < 0 || index > size() ) {
      String message = String.valueOf( index );
      throw new IndexOutOfBoundsException( message );
    }
    
    if( index == 0 ) {
      
      Node p = first;
      first = new Node( e, p, null );
      if( p != null ) {
        p.prev = first;
      }
      if( last == null ) {
        last = first;
      }
      return;
    }
    
    Node pred = first;
    for( int k = 1; k <= index - 1; k++ ) {
      pred = pred.next;
    }
    
    Node succ = pred.next;
    Node middle = new Node( e, succ, pred );
    pred.next = middle;
    if( succ == null ) {
      last = middle;
    } else {
      succ.prev = middle;
    }
    
  }
  
  /**
   * toString formats the list to be presented to the user
   * @return the list to be presented to the used
   */
  public String toString() {
    StringBuilder strBuilder = new StringBuilder();
    
    Node p = first;
    while( p != null ) {
      strBuilder.append( p.value + "\n" );
      p = p.next;
    }
    return strBuilder.toString();
  }
  
  /**
   * remove removes an element at a particular index
   * @param index the index of the element to be removed
   * @return the removed element
   */
  public T remove( int index ) {
    if( index < 0 || index > size() ) {
      String message = String.valueOf( index );
      throw new IndexOutOfBoundsException( message );
    }
    
    Node target = first;
    for( int k = 1; k <= index; k++ ) {
      target = target.next;
    }
    T element = target.value;
    Node pred = target.prev;
    Node succ = target.next;
    
    if( pred == null ) {
      first = succ;
    } else {
      pred.next = succ;
    }
    
    if( succ == null ) {
      last = pred;
    }else {
      succ.prev = pred;
    }
    
    return element;
  }
  
  /**
   * remove() removes the specified element
   * @param element the element to be removed
   * @return true if the element was removed or false otherwise
   */
  public boolean remove( T element ) {
    if( isEmpty() ) {
      return false;
    }
    
    Node target = first;
    while( target != null && !element.equals( target.value )) {
      target = target.next;
    }
    
    if( target == null ) {
      return false;
    }
    
    Node pred = target.prev;
    Node succ = target.next;
    
    if( pred == null ) {
      first = succ;
    } else {
      pred.next = succ;
    }
    
    if( succ == null ) {
      last = pred;
    } else {
      succ.prev = pred;
    }
    
    return true;
  }
  
  /**
   * get() gets the element in the specified index
   * @param index the index of the element to get
   * @return the element
   */
  public T get( int index ) {
    if( index < 0 || index > size() ) {
      String message = String.valueOf( index );
      throw new IndexOutOfBoundsException( message );
    }
    Node target = first;
    for( int k = 1; k <= index; k++ ) {
      target = target.next;
    }
    
    return target.value;
  }
}
