//  HackerRank 30 Days of Code
//  Day 02 - Operators
//
// Created by Austin Swack
// Created on 11/16/2021

import java.io.*;

class Result {
  public static void solve(double meal_cost, int tip_percent, int tax_percent) {
    double finalCost = meal_cost + (meal_cost*((double)tip_percent/100)) + (meal_cost*((double)tax_percent/100));
    System.out.println(Math.round(finalCost));
  }
}

public class Day02 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    double meal_cost = Double.parseDouble(bufferedReader.readLine().trim());
    int tip_percent = Integer.parseInt(bufferedReader.readLine().trim());
    int tax_percent = Integer.parseInt(bufferedReader.readLine().trim());
    bufferedReader.close();

    Result.solve(meal_cost, tip_percent, tax_percent);
  }
}