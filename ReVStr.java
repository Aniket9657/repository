package com.Collection;

public class ReVStr {
    public static void main(String[] args) {
        String s1 = " This is an example ";

        // Step 1: Trim the string and split it by spaces
        String[] words = s1.trim().split(" +");  // Handles multiple spaces

        // Step 2: Print the words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i]);
            if (i != 0) {
                System.out.print(" ");
            }
        }
    }
}
