//  HackerRank Java
//  Data Structures: Java Hashset
//  https://www.hackerrank.com/challenges/java-hashset/problem
//  Created by Austin Swack
//  Created on 12/14/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("Java/data/JavaHashSet.txt");
    Scanner s = new Scanner(file);
    int t = s.nextInt();
    String [] pair_left = new String[t];
    String [] pair_right = new String[t];

    for (int i = 0; i < t; i++) {
      pair_left[i] = s.next();
      pair_right[i] = s.next();
    }

    HashSet<String> hs = new HashSet<>();

    for (int i = 0; i < t; i++) {
      hs.add(pair_left[i] + " " + pair_right[i]);
      System.out.println(hs.size());
    }
  }
}