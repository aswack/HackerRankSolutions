//  HackerRank Problem Solving - Algorithms
//  Implementation: Encryption (Medium)
//  https://www.hackerrank.com/challenges/encryption/problem
//  Created by Austin Swack
//  Created on 12/24/2021
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Encryption {

  public static String encryption(String s) {
    int rows = (int)Math.floor(Math.sqrt((double)s.length()));
    int cols = (int)Math.ceil(Math.sqrt((double)s.length()));
    if (rows * cols < s.length()) {
      rows++;
    }

    String[][] grid = new String[rows][cols];
    int count = 0;
    StringBuilder encrypted = new StringBuilder(s.length());

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < cols; j++) {
        if (count < s.length()) {
          grid[i][j] = Character.toString(s.charAt(count));
          count++;
        }
      }
    }

    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        if (grid[j][i] != null) {
          encrypted.append(grid[j][i]);
        }
      }
      encrypted.append(" ");
    }
    return encrypted.toString();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("algorithms/data/Encryption.txt"));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("algorithms/data/EncryptionOUTPUT.txt"));
    String s = bufferedReader.readLine();

    while (s != null) {
      String result = encryption(s);

      bufferedWriter.write(result);
      bufferedWriter.newLine();
      s = bufferedReader.readLine();
    }

    bufferedReader.close();
    bufferedWriter.close();
  }
}