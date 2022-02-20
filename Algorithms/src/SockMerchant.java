//  HackerRank Problem Solving - Algorithms
//  Implementation: Sales by Match (Easy)
//  https://www.hackerrank.com/challenges/sock-merchant/problem
//  Created by Austin Swack
//  Created on 2/19/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SockMerchant {
  public static int sockMerchant(int n, List<Integer> arr) {
    Collections.sort(arr);
    int pairs = 0;

    for (int i = 0; i < arr.size()-1; i++) {
      if (arr.get(i) == arr.get(i+1)) {
        i++;
        pairs++;
      }
    }
    return pairs;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/SockMerchant.txt"));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    int result = sockMerchant(n, ar);
    System.out.println(result);

    bufferedReader.close();
  }
}
