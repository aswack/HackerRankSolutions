//  HackerRank 30 Days of Code
//  Day 21: Generics
//
// Created by Austin Swack
// Created on 12/5/2021

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Printer <T> {

  public void printArray(T[] array) {
    for (T item : array) {
      System.out.println(item);
    }
  }
}

public class Day21 {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("data/day21input.txt");
    //Scanner scanner = new Scanner(System.in);
    Scanner scanner = new Scanner(file);
    int n = scanner.nextInt();
    Integer[] intArray = new Integer[n];
    for (int i = 0; i < n; i++) {
      intArray[i] = scanner.nextInt();
    }

    n = scanner.nextInt();
    String[] stringArray = new String[n];
    for (int i = 0; i < n; i++) {
      stringArray[i] = scanner.next();
    }

    Printer<Integer> intPrinter = new Printer<Integer>();
    Printer<String> stringPrinter = new Printer<String>();
    intPrinter.printArray(intArray);
    stringPrinter.printArray(stringArray);
    if(Printer.class.getDeclaredMethods().length > 1){
      System.out.println("The Printer class should only have 1 method named printArray.");
    }
  }
}