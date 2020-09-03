package com.digit;

import java.util.Random;
import java.util.Scanner;

public class Digit {
    public static void main(String[] args) {
        Random newRandom = new Random();
        int randomNumber = newRandom.nextInt(5);
        System.out.println("Введите число от 1 до 5:");
        Scanner scanner = new Scanner(System.in);
        int scannerNumber = scanner.nextInt();

        if (scannerNumber > randomNumber || scannerNumber < randomNumber) {
            for (int i = 5; i > 0; --i) {
                if (scannerNumber > randomNumber) {
                    System.out.println("Ваше число больше загаданного Осталось попыток: " + i);
                    Scanner newscannerT = new Scanner(System.in);
                    int scannerTwo = newscannerT.nextInt();
                    scannerNumber = scannerTwo;
                } else if (scannerNumber < randomNumber) {
                    System.out.println("Ваше число Меньше загаданного. Осталос попыток " + i);
                    Scanner newscnnaerThree = new Scanner(System.in);
                    int newScannerThree = newscnnaerThree.nextInt();
                    scannerNumber = newScannerThree;
                }
            }
            if (scannerNumber == randomNumber) {
                System.out.println("Победа!");
            }
        }
        if (scannerNumber > randomNumber || scannerNumber < randomNumber) {
            System.out.println("Попытки закончились");
        }
    }
}

