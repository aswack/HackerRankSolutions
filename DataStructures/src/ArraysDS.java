//  HackerRank Problem Solving
//  Arrays: Arrays - DS
//  https://www.hackerrank.com/challenges/arrays-ds/problem
//  Created by Austin Swack
//  Created on 12/17/2021
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
import java.io.*;
import java.util.*;
import java.util.stream.*;

public class ArraysDS {
  public static List<Integer> reverseArray(List<Integer> a) {
    // Collections.reverse(a);
    int n = a.size()-1;
    while (n >= 0) {
      a.add(a.get(n));
      a.remove(n);
      n--;
    }
    return a;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("DataStructures/data/ArraysDS.txt"));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("DataStructures/data/ArraysDSOUTPUT.txt"));

    int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> res = reverseArray(arr);

    bufferedWriter.write(
        res.stream()
            .map(Object::toString)
            .collect(joining(" "))
            + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();
  }
}
