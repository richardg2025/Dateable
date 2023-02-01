package PACKAGE_NAME;

import java.util.Scanner;

public class Dateable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age: ");

        int age = (int) scanner.nextInt();

        int date = age / 2 + 7;

        System.out.println("You should date someone older than " + date);

    }

}

