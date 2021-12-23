//  HackerRank Problem Solving - Algorithms
//  Implementation: The Time in Words (Medium)
//  https://www.hackerrank.com/challenges/the-time-in-words/problem
//  Created by Austin Swack
//  Created on 12/22/2021
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TimeInWords {

  public static String timeInWords(int h, int m) {
    String pastTo;
    if (m == 0) {
      return hourFinder(h) + " o' clock";
    } else if (m <= 30) {
      pastTo = " past ";
    } else {
      pastTo = " to ";
      h++;
    }

    return minuteFinder(m) + pastTo + hourFinder(h);
  }

  private static String hourFinder(int h) {
    return switch (h) {
      case 1 -> "one";
      case 2 -> "two";
      case 3 -> "three";
      case 4 -> "four";
      case 5 -> "five";
      case 6 -> "six";
      case 7 -> "seven";
      case 8 -> "eight";
      case 9 -> "nine";
      case 10 -> "ten";
      case 11 -> "eleven";
      case 12 -> "twelve";
      default -> "";
    };
  }

  private static String minuteFinder(int m) {
    return switch (m) {
      case 1, 59 -> "one minute";
      case 2, 58 -> "two minutes";
      case 3, 57 -> "three minutes";
      case 4, 56 -> "four minutes";
      case 5, 55 -> "five minutes";
      case 6, 54 -> "six minutes";
      case 7, 53 -> "seven minutes";
      case 8, 52 -> "eight minutes";
      case 9, 51 -> "nine minutes";
      case 10, 50 -> "ten minutes";
      case 11, 49 -> "eleven minutes";
      case 12, 48 -> "twelve minutes";
      case 13, 47 -> "thirteen minutes";
      case 14, 46 -> "fourteen minutes";
      case 15, 45 -> "quarter";
      case 16, 44 -> "sixteen minutes";
      case 17, 43 -> "seventeen minutes";
      case 18, 42 -> "eighteen minutes";
      case 19, 41 -> "nineteen minutes";
      case 20, 40 -> "twenty minutes";
      case 21, 39 -> "twenty one minutes";
      case 22, 38 -> "twenty two minutes";
      case 23, 37 -> "twenty three minutes";
      case 24, 36 -> "twenty four minutes";
      case 25, 35 -> "twenty five minutes";
      case 26, 34 -> "twenty six minutes";
      case 27, 33 -> "twenty seven minutes";
      case 28, 32 -> "twenty eight minutes";
      case 29, 31 -> "twenty nine minutes";
      case 30 -> "half";
      default -> "";
    };
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("algorithms/data/TimeInWords.txt"));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("algorithms/data/TimeInWordsOUTPUT.txt"));

    while (bufferedReader.readLine() != null) {
      int h = Integer.parseInt(bufferedReader.readLine().trim());
      int m = Integer.parseInt(bufferedReader.readLine().trim());

      String result = timeInWords(h, m);

      bufferedWriter.write(result);
      bufferedWriter.newLine();
    }

    bufferedReader.close();
    bufferedWriter.close();
  }
}