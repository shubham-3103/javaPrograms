package com.edu.MavenTest;

public class VoteTest {
 
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int age =16;
        try {
            if(age < 18) {
                throw new VoteException("Your age is not eligible to vote");
            }
        } catch(VoteException e) {
            System.out.println(e.getMessage());
        }
    }
 
}