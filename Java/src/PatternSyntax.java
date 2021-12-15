//  HackerRank Java
//  Strings: Java Regex
//  https://www.hackerrank.com/challenges/java-regex/problem
//  Created by Austin Swack
//  Created on 12/14/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntax {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("Java/data/PatternSyntax.txt");
    Scanner in = new Scanner(file);
    int testCases = Integer.parseInt(in.nextLine());

    while(testCases>0) {
      String strPattern = in.nextLine();

      try {
        Pattern.compile(strPattern);
        System.out.println("Valid");
        testCases--;
      } catch (PatternSyntaxException e) {
        System.out.println("Invalid");
        testCases--;
      }
    }
  }
}