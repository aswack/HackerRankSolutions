//  HackerRank 30 Days of Code
//  Day 03 - Intro to Conditional Statements
//
// Created by Austin Swack
// Created on 11/17/2021

import java.io.*;

public class Day03 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    int N = Integer.parseInt(bufferedReader.readLine().trim());

    bufferedReader.close();

    if (N%2!=0){
      System.out.println("Weird");
    } else if (N>=2 && N<= 5){
      System.out.println("Not Weird");
    } else if (N>20){
      System.out.println("Not Weird");
    } else {
      System.out.println("Weird");
    }
  }
}