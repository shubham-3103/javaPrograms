package com.edu.thread;
 
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.FileOutputStream;
 
// Serializable class
class Game implements Serializable {
    String name = "Shubham";
    int no = 90;
}
 
public class SerDeserExample implements Serializable {
    public static void main(String[] args) {
        Game gm = new Game();
        try {
            // Creating FileOutputStream
            FileOutputStream fout = new FileOutputStream("abcd.txt");
            // Creating ObjectOutputStream
            ObjectOutputStream o = new ObjectOutputStream(fout);
            // Writing the serialized object to the file
            o.writeObject(gm);
            // Closing the ObjectOutputStream
            o.close();
            // Indicate that the operation was successful
            System.out.println("Serialization successful. File created.");
        } catch (Exception e) {
            // Print the stack trace if an exception occurs
            e.printStackTrace();
        }
    }
}