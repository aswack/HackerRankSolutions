//  HackerRank Java
//  Strings: Java Regex
//  https://www.hackerrank.com/challenges/java-regex/problem
//  Created by Austin Swack
//  Created on 12/14/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class JavaRegex{

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("Java/data/JavaRegex.txt");
    Scanner in = new Scanner(file);
    while(in.hasNext()){
      String IP = in.next();
      System.out.print(IP.matches(new MyRegex().myPattern) + " -- ");
      System.out.println(IP.matches(new MyRegex().pattern));
    }
  }
}

class MyRegex {
  String ip255 = "([0-1]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
  String myPattern = ip255 + "\\." + ip255 + "\\." + ip255 + "\\." + ip255;
  // Shorter version - {3} means to match three of the preceeding token.
  // Match three number blocks with the period - then one without
  String pattern = "^(([0-1]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5])\\.){3}([0-1]?[0-9]?[0-9]?|2[0-4][0-9]|25[0-5]){1}$";
}