//  HackerRank 30 Days of Code
//  Day 16 - Exceptions - String to Integer
//
// Created by Austin Swack
// Created on 11/30/2021
import java.io.*;

public class Day16 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    String S = bufferedReader.readLine();
    bufferedReader.close();

    try {
      System.out.println(Integer.parseInt(S));
    } catch (Exception e) {
      System.out.println("Bad String");
    }
  }
}
