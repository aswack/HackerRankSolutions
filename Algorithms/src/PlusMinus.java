//  HackerRank Problem Solving - Algorithms
//  Warmup: Plus Minus (Easy)
//  https://www.hackerrank.com/challenges/plus-minus/problem
//  Created by Austin Swack
//  Created on 3/6/2022

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class PlusMinus {
  public static void plusMinus(List<Integer> arr) {
    int pos = 0;
    int neg = 0;
    int zero = 0;

    for (int i : arr) {
      if (i > 0)
        pos++;
      else if (i < 0)
        neg++;
      else
        zero++;
    }

    if (arr.size() != 0) {
      double posRatio = (double)pos/arr.size();
      double negRatio = (double)neg/arr.size();
      double zeroRatio = (double)zero/arr.size();

      System.out.printf("%7.6f%n", posRatio);
      System.out.printf("%7.6f%n", negRatio);
      System.out.printf("%7.6f%n", zeroRatio);
    } else {
      System.out.println("0\n0\n0");
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/PlusMinus.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    plusMinus(arr);

    bufferedReader.close();
  }
}
