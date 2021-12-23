//  HackerRank Problem Solving - Algorithms
//  Implementation: Angry Professor (Easy)
//  https://www.hackerrank.com/challenges/angry-professor/problem
//  Created by Austin Swack
//  Created on 12/22/2021
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class AngryProf {

  public static String angryProfessor(int k, List<Integer> a) {
    int onTimeCount = 0;

    for (int arrival : a) {
      if (arrival <= 0) onTimeCount++;
    }

    if (onTimeCount < k) {
      return "YES";
    } else {
      return "NO";
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("algorithms/data/AngryProf.txt"));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("algorithms/data/AngryProfOutput.txt"));

    int t = Integer.parseInt(bufferedReader.readLine().trim());

    for (int tItr = 0; tItr < t; tItr++) {
      String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

      int n = Integer.parseInt(firstMultipleInput[0]);

      int k = Integer.parseInt(firstMultipleInput[1]);

      String[] aTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

      List<Integer> a = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        int aItem = Integer.parseInt(aTemp[i]);
        a.add(aItem);
      }

      String result = angryProfessor(k, a);

      bufferedWriter.write(result);
      bufferedWriter.newLine();
    }

    bufferedReader.close();
    bufferedWriter.close();
  }
}