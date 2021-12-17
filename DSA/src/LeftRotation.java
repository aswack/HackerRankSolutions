//  HackerRank Problem Solving
//  Arrays: Left Rotation
//  https://www.hackerrank.com/challenges/array-left-rotation/problem
//  Created by Austin Swack
//  Created on 12/17/2021
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class LeftRotation {
  public static List<Integer> rotateLeft(int d, List<Integer> arr) {
    while (d > 0) {
      arr.add(arr.get(0));
      arr.remove(0);
      d--;
    }
    return arr;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("DSA/data/LeftRotation.txt"));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("DSA/data/LeftRotationOUTPUT.txt"));

    String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
    int d = Integer.parseInt(firstMultipleInput[1]);

    List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    List<Integer> result = rotateLeft(d, arr);

    bufferedWriter.write(
        result.stream()
            .map(Object::toString)
            .collect(joining(" "))
            + "\n"
    );

    bufferedReader.close();
    bufferedWriter.close();
  }
}