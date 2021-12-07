//  HackerRank Java
//  Data Structures: Java Subarray
//  https://www.hackerrank.com/challenges/java-negative-subarray/problem
//  Created by Austin Swack
//  Created on 12/6/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaSubarray {

  public static void main(String[] args) {
    File file = new File("Java/data/JavaSubarray.txt");
    Scanner scan = null;
    try {
      scan = new Scanner(file);
    } catch (FileNotFoundException e) {
      System.out.println("ERROR: FILE NOT FOUND");
      System.out.println(e.getMessage());
    }

    assert scan != null;
    int entries = scan.nextInt();
    int[] arr = new int[entries];

    for (int i = 0; i < entries; i++) {
      arr[i] = scan.nextInt();
    }
    scan.close();

    int count = 0;
    for (int i = 0; i < entries; i++) {
      int tempSum = 0;
      for (int j = i; j < entries; j++) {
        tempSum += arr[j];
        if (tempSum < 0) {
          count++;
        }
      }
    }
    System.out.println(count);
  }
}