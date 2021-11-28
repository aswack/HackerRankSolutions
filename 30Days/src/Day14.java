//  HackerRank 30 Days of Code
//  Day 14 - Scope
//
// Created by Austin Swack
// Created on 11/28/2021
import java.util.Scanner;

class Difference {
  private int[] elements;
  public int maximumDifference;

  public Difference(int[] elements) {
    this.elements = elements;
  }

  public void computeDifference() {
    int min = Math.abs(elements[0]);
    int max = Math.abs(elements[0]);

    for (int num : elements) {
      if (Math.abs(num) < min) min = num;
      if (Math.abs(num) > max) max = num;
    }
    maximumDifference = max-min;
  }
}

public class Day14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] a = new int[n];
    for (int i = 0; i < n; i++) {
      a[i] = sc.nextInt();
    }
    sc.close();

    Difference difference = new Difference(a);

    difference.computeDifference();

    System.out.print(difference.maximumDifference);
  }
}