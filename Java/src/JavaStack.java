//  HackerRank Java
//  Data Structures: Java Stack
//  https://www.hackerrank.com/challenges/java-stack/problem
//  Created by Austin Swack
//  Created on 12/18/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

class JavaStack {
  public static void main(String[] args) throws FileNotFoundException {
    Scanner sc = new Scanner(new File("Java/data/JavaStack.txt"));

    while (sc.hasNext()) {
      String input = sc.next();

      Stack<Character> stack = new Stack<>();

      for (int i = 0; i < input.length(); i++) {

        if(!stack.isEmpty()) {
          switch (input.charAt(i)) {
            case ')':
              if (stack.peek() == '(') stack.pop();
              break;
            case '}':
              if (stack.peek() == '{') stack.pop();
              break;
            case ']':
              if (stack.peek() == '[') stack.pop();
              break;
            default: stack.push(input.charAt(i));
          }
        } else {
          stack.push(input.charAt(i));
        }
      }
      if (stack.isEmpty()) {
        System.out.println("true");
      } else {
        System.out.println("false");
      }
    }
  }
}