//  HackerRank Problem Solving - Algorithms
//  Implementation: Bon Appetit (Easy)
//  https://www.hackerrank.com/challenges/bon-appetit/problem
//  Created by Austin Swack
//  Created on 2/18/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class BonAppetit {
  public static void bonAppetit(List<Integer> bill, int k, int b) {
    int total = 0;

    for (int i : bill) {
      total += i;
    }

    int shared = total - bill.get(k);

    if (b == shared/2) {
      System.out.println("Bon Appetit");
    } else {
      System.out.println(b - (shared/2));
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/BonAppetit.txt"));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    int n = Integer.parseInt(firstMultipleInput[0]);
    int k = Integer.parseInt(firstMultipleInput[1]);

    List<Integer> bill = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int b = Integer.parseInt(bufferedReader.readLine().trim());

    bonAppetit(bill, k, b);

    bufferedReader.close();
  }
}
                