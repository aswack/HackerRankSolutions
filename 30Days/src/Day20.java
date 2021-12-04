//  HackerRank 30 Days of Code
//  Day 20: Sorting
//
// Created by Austin Swack
// Created on 12/4/2021
import static java.util.stream.Collectors.toList;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class Day20 {

  public static void main(String[] args) throws IOException {
    File test = new File("data/day20input.txt");
    //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedReader bufferedReader = new BufferedReader(new FileReader(test));
    int n = Integer.parseInt(bufferedReader.readLine().trim()); // n is equal to the number of elements in List a
    List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    bubbleSort(a);
    bufferedReader.close();
  }

  private static void bubbleSort(List<Integer> a) {
    boolean swapped = true;
    int swaps = 0;

    while (swapped) {
      swapped = false;
      for (int i = 0; i < a.size() - 1; i++) {
        if (a.get(i) > a.get(i+1)) {
          int temp = a.get(i+1);
          a.set(i+1, a.get(i));
          a.set(i, temp);
          swapped = true;
          swaps++;
        }
      }
    }

    System.out.println("Array is sorted in " + swaps + " swaps.");
    System.out.println("First Element: " + a.get(0));
    System.out.println("Last Element: " + a.get(a.size()-1));
  }
}