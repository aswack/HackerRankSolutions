//  HackerRank 30 Days of Code
//  Day 10 - Binary Numbers
//
// Created by Austin Swack
// Created on 11/24/2021
import java.io.*;

public class Day10 {

  public static int countConsecutiveOnes(int n) {
    if (n < 1)
      return -1;

    String binary = Integer.toBinaryString(n);
    int currentCount = 0;
    int maxCount = 0;

    for (int i = 0; i < binary.length(); i++){
      if (binary.charAt(i) == '1')
        currentCount++;
      else if (binary.charAt(i) == '0')
        currentCount = 0;

      if (currentCount > maxCount)
        maxCount = currentCount;
    }
    return maxCount;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine().trim());
    bufferedReader.close();

    System.out.println(countConsecutiveOnes(n));
  }
}