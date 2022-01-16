//  HackerRank Problem Solving - Algorithms
//  Sorting: Insertion Sort - Parts 1 & 2 (Easy)
//  https://www.hackerrank.com/challenges/insertionsort1/problem
//  https://www.hackerrank.com/challenges/insertionsort2/problem
//  Created by Austin Swack
//  Created on 1/15/2022
import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class InsertionSort {

  public static void insertionSort1(int n, List<Integer> arr) {
    int temp = arr.get(n-1);
    for (int i = n-1; i >= 0; i--) {
      if (i == 0 && arr.get(0) > temp) {
        arr.set(0, temp);
        print(arr);
      } else if (arr.get(i-1) > temp) {
        arr.set(i, arr.get(i-1));
        print(arr);
      } else {
        arr.set(i, temp);
        print(arr);
        break;
      }
    }
  }

  public static void insertionSort2(int n, List<Integer> arr) {
    for (int i = 1; i < n; i++) {
      int temp = arr.get(i);
      int j = i-1;
      while (j >=0) {
        if (arr.get(j) > temp) {
          arr.set(j+1, arr.get(j));
          j--;
        } else {
          break;
        }
      }
      arr.set(j+1, temp);
      print(arr);
    }
  }

  private static void print(List<Integer> arr) {
    for (int i : arr) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br1 = new BufferedReader(new FileReader("DataStructures/data/InsertionSort1.txt"));
    BufferedReader br2 = new BufferedReader(new FileReader("DataStructures/data/InsertionSort2.txt"));
    int n1 = Integer.parseInt(br1.readLine().trim());
    int n2 = Integer.parseInt(br2.readLine().trim());

    List<Integer> arr1 = Stream.of(br1.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> arr2 = Stream.of(br2.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    System.out.println("\n====== PART 1 ======");
    insertionSort1(n1, arr1);
    System.out.println("\n====== PART 2 ======");
    insertionSort2(n2, arr2);

    br1.close();
    br2.close();
  }
}
