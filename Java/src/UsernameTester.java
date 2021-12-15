//  HackerRank Java
//  Strings: Valid Username Regular Expression
//  https://www.hackerrank.com/challenges/valid-username-checker/problem
//  Created by Austin Swack
//  Created on 12/14/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class UsernameValidator {
  // Starts with upper or lowrcase letter, then ends with 7-29 word characters (alphanumeric, underscore)
  public static final String regularExpression = "^([a-z]|[A-Z])\\w{7,29}";
}

public class UsernameTester {

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("Java/data/UsernameTester.txt");
    Scanner scan = new Scanner(file);
    int n = Integer.parseInt(scan.nextLine());
    while (n-- != 0) {
      String userName = scan.nextLine();

      if (userName.matches(UsernameValidator.regularExpression)) {
        System.out.println("Valid");
      } else {
        System.out.println("Invalid");
      }
    }
  }
}