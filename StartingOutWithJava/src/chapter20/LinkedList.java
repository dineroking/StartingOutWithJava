/**
 * Created by Ronny Rosabal.
 * Date:      3/7/2017
 * Objective:
 */
package chapter20;

public class LinkedList {
  
  class Node {
    
    String value;
    Node next;
    Node prev;
    
    Node( String v, Node n, Node p ) {
      
      value = v;
      next = n;
      prev = p;
      
    }
  }
  
}
