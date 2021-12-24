//  HackerRank Problem Solving - Algorithms
//  Implementation: Grading Students (Easy)
//  https://www.hackerrank.com/challenges/grading/problem
//  Created by Austin Swack
//  Created on 12/23/2021
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class Result2 {

  public static List<Integer> gradingStudents(List<Integer> grades) {
    for (int i = 0; i < grades.size(); i++) {
      int grade = grades.get(i);
      if (grade < 38) continue;
      if (grade % 10 == 4 || grade % 10 == 9) {
        grade++;
        grades.set(i, grade);
      } else if (grade % 10 == 3 || grade % 10 == 8) {
        grade += 2;
        grades.set(i, grade);
      }
    }
    return grades;
  }
}

public class GradingStudents {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/GradingStudents.txt"));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("Algorithms/data/GradingStudentsOUTPUT.txt"));

    int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> grades = new ArrayList<>();

    for (int i = 0; i < gradesCount; i++) {
      int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
      grades.add(gradesItem);
    }

    List<Integer> result = Result2.gradingStudents(grades);

    for (int i = 0; i < result.size(); i++) {
      bufferedWriter.write(String.valueOf(result.get(i)));

      if (i != result.size() - 1) {
        bufferedWriter.write("\n");
      }
    }

    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
