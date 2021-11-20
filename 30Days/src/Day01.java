//  HackerRank 30 Days of Code
//  Day 01 - Data Types
//
// Created by Austin Swack
// Created on 11/15/2021

import java.util.*;

public class Day01 {
  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);

    int scannedInt = scan.nextInt();
    double scannedDouble = scan.nextDouble();
    scan.nextLine();
    String scannedString = scan.nextLine();
    scan.close();

    System.out.println(i+scannedInt);
    System.out.println(d+scannedDouble);
    System.out.println(s+scannedString);
  }
}