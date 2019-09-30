package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("Hello World2");
                    String str1 = args[0];
            int marks = Integer.parseInt(str1);
            switch (marks) {
                case 90:
                    System.out.println("You marks:"+marks+" and rank is A");// Comment Roma
                    break;
                case 80:
                    System.out.println("You marks:"+marks+" and rank is B");
                    break;
                case 70:
                    System.out.println("You marks:"+marks+" and rank is C");
                    break;
                default:

                    System.out.println("You marks:"+marks+" rank is FAIL");//Hello World comment

	// write your code here
    }
}}
