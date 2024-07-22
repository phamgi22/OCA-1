package com.company;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ConditionalLogic {
    static Scanner sc = new Scanner(System.in);
    final static int JAN = 1;
    final static int FEB = 2;
    final static int MAR = 3;
    final static int APR = 4;
    final static int MAY = 5;
    final static int JUN = 6;
    final static int JUL = 7;
    final static int AUG = 8;
    final static int SEP = 9;
    final static int OCT = 10;
    final static int NOV = 11;
    final static int DEC = 12;

    public static void main(String[] args) {
//        preAndPostDifference();
//        booleanLogicShortCircuitOps();
//        booleanBitwiseOps();
//        compareStrings();
//        System.out.println("Please enter film certification: ");
//        int certId = sc.nextInt();
//        System.out.println("Please enter age: ");
//        int age = sc.nextInt();
//        System.out.println(admitToFilm(certId, age));

        switchVowelOrConsonant();
    }

    public static void preAndPostDifference() {
        int x = 5;
        int y = 10;
        System.out.println(String.format("The value of x is %d", x));
        System.out.println(String.format("The value of ++x is %d", ++x));
        System.out.println(String.format("The value of x++ is %d", x++));
        System.out.println(String.format("The value of x is %d",x));

        System.out.println(String.format("The value of y is %d", y));
        System.out.println(String.format("The value of --y is %d", --y));
        System.out.println(String.format("The value of y-- is %d", y--));
        System.out.println(String.format("The value of y is %d",y));
    }

    public static void booleanLogicShortCircuitOps() {
        boolean b = false;
        int x = 3;

        if (x < 0 && (b = true)) { // second expression will not be evaluated and executed
            System.out.println(b);
        } else if (x > 0 || (b = true)) { // second expression will not be evaluated and executed
            System.out.println(b); // b will be printed out as false
        }

    }

    public static void booleanBitwiseOps() {
        boolean b = false;
        int x = 3;

        if (x < 0 & (b = true)) { // second expression will be evaluated and executed
            System.out.println(b);
        } else if (x > 0 | (b = true)) { // second expression will be evaluated and executed
            System.out.println(b); // b will be printed out as true
        }

    }

    public static void compareStrings() {
        System.out.println("Enter string-1: ");
        String s1 = sc.nextLine();
        System.out.println("Enter string-2: ");
        String s2 = sc.nextLine();

        System.out.println(s1 == s2); // compare object reference
        System.out.println(s1.equals(s2)); // compare string value
    }

    public static boolean admitToFilm(int x, int y) {
        return y >= 18;
    }

    public static void switchVowelOrConsonant() {
        System.out.println("Please enter a character: ");
        char letter = sc.next().charAt(0);

        if (Character.isAlphabetic(letter)) {
            switch(letter) {
                case 'a', 'e', 'i', 'o', 'u', 65, 'E', 'I', 'O', 'U' -> System.out.println(letter + " is a vowel");
                default -> System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(String.format("Letter %s is invalid", letter));
        }
    }

    public static void ifMonth() {
        System.out.println("Please enter month in the range 1..12:");
        int month = sc.nextInt();

        if (month == JAN) {
            System.out.println("January");
        } else if (month == FEB) {
            System.out.println("February");
        } else if (month == MAR) {
            System.out.println("March");
        } else if (month == APR) {
            System.out.println("April");
        } else if (month == MAY) {
            System.out.println("May");
        } else if (month == JUN) {
            System.out.println("June");
        } else if (month == JUL) {
            System.out.println("July");
        } else if (month == AUG) {
            System.out.println("August");
        } else if (month == SEP) {
            System.out.println("September");
        } else if  (month == OCT) {
            System.out.println("October");
        } else if (month == NOV) {
            System.out.println("November");
        } else if (month == DEC) {
            System.out.println("December");
        } else {
            System.out.println("The input value is out of range");
        }
    }

    public static void ifGrade() {
        System.out.println("Please enter a mark in the range 0...100");
        int grade = sc.nextInt();
        if (70 <= grade && grade <= 100) {
            System.out.println("A");
        } else if (60 <= grade && grade <= 69) {
            System.out.println("B");
        } else if (50 <= grade && grade <= 59) {
            System.out.println("C");
        } else if (40 <= grade && grade <= 49) {
            System.out.println("D");
        } else {
            System.out.println("Fail");
        }
    }

    public static void switchMathOperator() {
        double answer = 0.0;
        boolean operationOK = true;

        System.out.println("Please input num1:");
        double num1 = sc.nextDouble();
        System.out.printf("Please input num2");
        double num2 = sc.nextDouble();
        System.out.println("Please input an operation character");
        char op = sc.next().charAt(0);
        switch(op) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                System.out.println("Unknown operator");
                operationOK = false;
                break;
        }

        if (operationOK) {
            System.out.println(answer);
        }
    }

    public static void ifTemperature() {
        int tem = 0;
        final int COLD = 0;
        final int MILD = 15;
        final int WAMR = 20;
        final int VERY_WARM = 25;
        final int HOT = 30;

        if (tem <= COLD) {
            System.out.println("cold");
        } else if (1 <= tem && tem <= 14) {
            System.out.println("a little cold but ok");
        } else if (15 <= tem && tem <= 19) {
            System.out.println("mild");
        } else if (20 <= tem && tem <= 24) {
            System.out.println("warm");
        } else if (25 <= tem && tem <= 29) {
            System.out.println("very warm");
        } else {
            System.out.println("hot");
        }
    }

    public static void swithDaysInMonth() {
        int numDas = 0;

        System.out.println("Please enter a month 1..12");
        int month = sc.nextInt();
        switch (month) {
            case JAN:
            case MAR:
            case MAY:
            case JUL:
            case AUG:
            case OCT:
            case DEC:
                numDas = 31;
                break;
            case FEB:
                System.out.println("Please enter a year");
                if ((sc.nextInt() % 400 == 0) || (sc.nextInt() % 4 == 0 && sc.nextInt() % 100 == 1)) {
                    numDas = 29;
                } else {
                    numDas = 28;
                }
            default:
                numDas = 30;



        }
    }
}
