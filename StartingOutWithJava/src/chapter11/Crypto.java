import java.io.*;

/**
   The Crypto class encrypts data for the 
   File Encryption Filter programming challenge.
*/

public class Crypto
{
   /**
      The encryptFile method makes an encrypted copy
      of an existing file.
      @param existing The name of the existing file to encrypt.
      @param encrypted The name of the encrypted file to create.
      @exception IOException When an IO error occurs.
   */
   
   public static void encryptFile(String existing, String encrypted)
                      throws IOException
   {
      boolean eof = false;  // End of file flag
      
      // Open the files.
      FileInputStream inStream = new FileInputStream(existing);
      DataInputStream inFile = new DataInputStream(inStream);
      
      FileOutputStream outStream = new FileOutputStream(encrypted);
      DataOutputStream outFile = new DataOutputStream(outStream);
      
      // Process the file.
      while (!eof)
      {
         try
         {
            // Read a byte.
            byte input = inFile.readByte();
            
            // Encrypt the byte.
            input += 10;
            
            // Write the encrypted byte.
            // Note that IOException is not caught
            // in this try statement. If that happens
            // the method rethrows it.
            outFile.writeByte(input);
         }
         catch (EOFException e)
         {
            eof = true;
         }
      }
      
      // Close the files.
      outFile.close();
      inFile.close();
   }
}