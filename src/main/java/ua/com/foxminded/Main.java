package ua.com.foxminded;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your word or sentence below");
        String textInput = sc.nextLine(); 
        sc.close();
        System.out.println(AnagramsEngine.reverseWords(textInput));
    }
}
