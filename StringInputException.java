package com.edu.MavenTest;

public class StringInputException {
    public static void main(String[] args) {
        String input = "1";
 
        try {
            if (input.matches("\\d+")) {
                throw new NumberFormatException("Invalid input Number: " + input);
            } else if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                throw new CharacterException("Invalid input String: " + input);
            } else {
                System.out.println("Valid String: " + input);
            }
        } catch (NumberFormatException | CharacterException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
 
    static class CharacterException extends Exception {
        public CharacterException(String message) {
            super(message);
        }
    }
}