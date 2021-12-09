//  HackerRank 30 Days of Code
//  Day 25: Running Time and Complexity
//  https://www.hackerrank.com/challenges/30-running-time-and-complexity/problem
//  Created by Austin Swack
//  Created on 12/9/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day25 {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("30Days/data/day25input.txt");
    Scanner scan = new Scanner(file);
    int testCases = scan.nextInt();

    while (scan.hasNextInt()) {
      int num = scan.nextInt();
      boolean prime = true;

      if (num < 2 || (num % 2 == 0 && num != 2)) {
        prime = false;
      } else {
        for (int i = 3; i <= Math.sqrt(num); i+=2) {
          if (num % i == 0) {
            prime = false;
            break;
          }
        }
      }
      if (prime) System.out.println("Prime");
      else System.out.println("Not prime");
    }
  }
}