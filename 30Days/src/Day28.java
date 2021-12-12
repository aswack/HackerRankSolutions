//  HackerRank 30 Days of Code
//  Day 28: RegEx, Patterns, and Intro to Databases
//  https://www.hackerrank.com/challenges/30-regex-patterns/problem
//  Created by Austin Swack
//  Created on 12/12/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day28 {

  public static void findGmail(File input) throws FileNotFoundException {
    Scanner scan = new Scanner(input);
    List<String> names = new ArrayList<>();
    int elements = scan.nextInt();
    scan.nextLine();

    while(scan.hasNext()) {
      String email = scan.nextLine();
      if (email.contains("@gmail.com"))
        names.add(email.split(" ")[0]);
    }

    Collections.sort(names);
    for (String name : names) {
      System.out.println(name);
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("30Days/data/day28input.txt");
    findGmail(file);
  }
}