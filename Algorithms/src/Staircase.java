//  HackerRank Problem Solving - Algorithms
//  Warmup: Staircase (Easy)
//  https://www.hackerrank.com/challenges/staircase/problem
//  Created by Austin Swack
//  Created on 2/4/2022

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Staircase {

  public static void staircase(int n) {
    int level = 1;
    int space;
    while (level <= n) {
      space = n - level;
      while (space > 0) {
        System.out.print(" ");
        space--;
      }
      for (int j = 0; j < level; j++) {
        System.out.print("#");
      }
      System.out.println();
      level++;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/Staircase.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    staircase(n);

    bufferedReader.close();
  }
}
