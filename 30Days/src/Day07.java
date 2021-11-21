//  HackerRank 30 Days of Code
//  Day 07 - Arrays
//
// Created by Austin Swack
// Created on 11/21/2021

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;

public class Day07 {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());
    bufferedReader.close();

    if (n > 0) { // This if statement was not needed to pass the challenge, but was created to do something with the variable n
      for (int i = arr.size()-1; i >= 0; i--) {
        System.out.print(arr.get(i)+" ");
      }
    }
  }
}