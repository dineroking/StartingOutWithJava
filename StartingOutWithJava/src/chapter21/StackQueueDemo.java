/*
 * Ronny Rosabal
 * Programming Fundamentals III
 * COSC 2336 2801
 * 04.08.17
 * demo file for the Stack and Queue Classes
 */

// TODO: comment out package chapter21
package chapter21;

// TODO: comment in package stacksAndQueues
//package stacksAndQueues;

import java.io.*;                                         // for File I/O exceptions
import javax.swing.JOptionPane;                           // for user dialog box

public class StackQueueDemo {
  
  public static void main( String[] args ) throws IOException {
    
    // TODO: change paths to match your system
    String file1 = "src/chapter21/";                      // path for first input file
    String file2 = "src/chapter21/";                      // path for second input file
    String outputFile = "src/chapter21/";                 // path for the output file
    String userInput;                                     // user selection from options
    PrintWriter output;                                   // for output to a new file
    FileReader reader;                                    // reads from the file
    StackCollection<String> stackList;                    // holds a stack of Strings
    QueueCollection<String> queueList;                    // holds a queue of Strings for file1
    QueueCollection<String> queueList2;                   // holds a queue of Strings for file2
    
    
    userInput = JOptionPane.showInputDialog( null,
                                             "what would you like to do to the file(s). 1 = reverse, 2 = " +
                                                   "convert, 3 = compare" );
    
    if( userInput.equals( "1" ) ) {                       // USER SELECTS TO REVERSE FILE
      
      // get input and output files
      file1 += JOptionPane.showInputDialog( null,
                                            "enter name of a text file in a .txt format" );
      outputFile += JOptionPane.showInputDialog( null,
                                                 "enter name of the output file in a .txt format" );
      
      reader = new FileReader( file1 );                   // set file1 to be read
      output = new PrintWriter( outputFile );             // create output file
      
      stackList = new StackCollection<>( reader.getList().size() );   // create stack list
      
      for( int i = 0; i < reader.getList().size(); i++ ) {
        stackList.push( reader.getChar( i ) );            // read each character from the file into the stack
      }
      
      while( !stackList.empty() ) {
        output.println( stackList.pop() );                // write each character from the stack into the output file
      }
      
      output.close();                                     // close output file
      
    } else if( userInput.equals( "2" ) ) {                // USER SELECTS TO CONVERT FILE
      
      file1 += JOptionPane.showInputDialog( null,
                                            "enter name of a text file in a .txt format" );
      outputFile += JOptionPane.showInputDialog( null,
                                                 "enter name of the output file in a .txt format" );
      
      reader = new FileReader( file1 );                   // set file1 to be read
      output = new PrintWriter( outputFile );             // create output file
      
      queueList = new QueueCollection<>( reader.getList().size() ); // create queue list
      
      for( int i = 0; i < reader.getList().size(); i++ ) {
        queueList.enqueue( reader.getChar( i ).toUpperCase() );  // read each character from the file into queue
      }
      
      while( !queueList.empty() ) {
        output.println( queueList.dequeue() );            // write each character from the queue into the output file
      }
      
      output.close();                                     // close output file
      
    } else if( userInput.equals( "3" ) ) {               // USER SELECTS TO COMPARE FILES
      
      file1 += JOptionPane.showInputDialog( null, "enter name of the first text file to compare in a .txt format" );
      file2 += JOptionPane.showInputDialog( null, "enter name of the second text file to compare in a .txt format" );
      
      // first file
      reader = new FileReader( file1 );                  // set file1 to be read
      queueList = new QueueCollection<>( reader.getCharsCounter() );    // create queue list 1
      
      for( int i = 0; i < reader.getCharsCounter(); i++ ) {
        queueList.enqueue( reader.getChar( i ) );        // read each character from file1 into queue list 1
      }
      
      // second file
      reader = new FileReader( file2 );                  // set file1 to be read
      queueList2 = new QueueCollection<>( reader.getCharsCounter() );   // create queue list 2
      
      for( int i = 0; i < reader.getCharsCounter(); i++ ) {
        queueList2.enqueue( reader.getChar( i ) );       // read each character from file2 into queue list 2
      }
      
      // files comparison
      boolean areEqual = false;                           // assume that both files are not equal
      if( queueList.capacity() == queueList2.capacity() ) {   // compare the size of the queue lists
        int i = 0;
        areEqual = true;
        while( i < queueList.capacity() && areEqual ) {
          if( !queueList.dequeue().equals( queueList2.dequeue() ) ) {
            areEqual = false;                             // set areEqual to false if characters are not equal
          }
          i++;
        }
      }
      
      // display appropriate message to user
      if( areEqual ) {
        JOptionPane.showMessageDialog( null, "The files are identical." );
      } else {
        JOptionPane.showMessageDialog( null, "The files are NOT identical." );
      }
    }
    
  }
  
}
