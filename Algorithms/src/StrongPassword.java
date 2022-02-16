//  HackerRank Problem Solving - Algorithms
//  Strings: Strong Password (Easy)
//  https://www.hackerrank.com/challenges/strong-password/problem
//  Created by Austin Swack
//  Created on 2/15/2022
import java.io.*;

public class StrongPassword {
  public static int minimumNumber(String password) {
    String numbers = "0123456789";
    String lower_case = "abcdefghijklmnopqrstuvwxyz";
    String upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String special_characters = "!@#$%^&*()-+";

    boolean nums = false;
    boolean lower = false;
    boolean upper = false;
    boolean special = false;

    int count = 0;
    char[] pw = password.toCharArray();



    for (char c : pw) {
      if (numbers.indexOf(c) != -1) {
        nums = true;
      }
      if (lower_case.indexOf(c) != -1) {
        lower = true;
      }
      if (upper_case.indexOf(c) != -1) {
        upper = true;
      }
      if (special_characters.indexOf(c) != -1) {
        special = true;
      }
    }

    if (!nums) {
      count++;
    }
    if (!lower) {
      count++;
    }
    if (!upper) {
      count++;
    }
    if (!special) {
      count++;
    }

    if (password.length() + count < 6) {
      count += 6 - (password.length() + count);
    }

    return count;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/StrongPassword.txt"));

    String password = bufferedReader.readLine();

    int answer = minimumNumber(password);
    System.out.println(answer);

    bufferedReader.close();
  }
}