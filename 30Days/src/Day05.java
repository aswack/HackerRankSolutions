//  HackerRank 30 Days of Code
//  Day 05 - Loops
//
// Created by Austin Swack
// Created on 11/19/2021

import java.io.*;

public class Day05 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine().trim());
    bufferedReader.close();

    for (int i = 1; i<=10; i++){
      System.out.println(n+" x "+i+" = "+(n*i));
    }
  }
}