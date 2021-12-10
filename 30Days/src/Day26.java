//  HackerRank 30 Days of Code
//  Day 26: Nested Logic
//  https://www.hackerrank.com/challenges/30-nested-logic/problem
//  Created by Austin Swack
//  Created on 12/10/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day26 {

  public static List<Integer> calculateFine(File file) throws FileNotFoundException {
    Scanner scan = new Scanner(file);
    List<Integer> fines = new ArrayList<>();

    while(scan.hasNextInt()) {
      int fine;

      int day1 = scan.nextInt();
      int month1 = scan.nextInt();
      int year1 = scan.nextInt();
      int day2 = scan.nextInt();
      int month2 = scan.nextInt();
      int year2 = scan.nextInt();

      if (year1 < year2) {
        fine = 0;
        fines.add(fine);
        continue;
      }

      if (year1 == year2) {
        if (month1 <= month2) {
          if (day1 <= day2) {
            fine = 0;
          } else {
            fine = 15 * (day1 - day2);
          }
        } else {
          fine = 500 * (month1 - month2);
        }
      } else {
        fine = 10000;
      }
      fines.add(fine);
    }
    return fines;
  }

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("30Days/data/day26input.txt");
    List<Integer> fineList = calculateFine(file);
    System.out.println(fineList);
  }
}
