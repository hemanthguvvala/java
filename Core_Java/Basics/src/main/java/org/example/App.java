package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //This is the initial state where jvm finds the main function of byteCode
        /*
          and also if you know, how to compile a java class, then only choose this IDE's or else you can fully
          understand the concept.
          Anyway, i will explain, when the class file saved, you need to compile it first
          with javac fileName.java
          and then bytecode will be generated, and you need to run it with
           -- java className
         */
        System.out.println("Hello world!");
        //primary data Types
        int n = 20; // to store the numbers,
        float f = 1.5f;
        double d = 2.565d;
        boolean flag = true;
        char c = 'H'; //to store single values

        String s = new String("text");
        String s1 = new String("text");

        int n1 = 20;

        /*
        This is a condition if - else, if - else if, and we have operators
        like for and - &&
                or - ||
                not - !
         */
        if(s == s1){
            System.out.println("This can be true"); // because here we are checking the object references
        }else if(n == n1){
            System.out.println("This will be true because, here we are checking the primary data itself");
        }else{
            System.out.println("random print");
        }

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        /*
        This is the advanced switch case
         */
        switch(num)  {
            case 1 -> System.out.println("Printing the number 1");
            default -> System.out.println("Printing the default case");
        }

        //Ternary Operator - condition ? true : false;
        String testOperation = num > 2 ? "num greater than 2" : "num less than 2";
        System.out.println(testOperation);
    }
}