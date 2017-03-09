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
  
  public LinkedList() {
    first = null;
    last = null;
  }
  
  
  
  // METHODS
  
  public boolean isEmpty(){
    return first == null;
  }
  
  public int size() {
    int count = 0;
    Node p = first;
    while( p != null ) {
      
      count++;
      p = p.next;
    }
    return count;
  }
  
  public void add( T e ) {
    
    if( isEmpty() ) {
      
      last = new Node( e );
      first = first;
    } else {
      
      last.next = new Node( e, null, last );
      last = last.next;
    }
  }
  
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
  
  public String toString() {
    StringBuilder strBuilder = new StringBuilder();
    
    Node p = first;
    while( p != null ) {
      strBuilder.append( p.value + "\n" );
      p = p.next;
    }
    return strBuilder.toString();
  }
  
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
}
