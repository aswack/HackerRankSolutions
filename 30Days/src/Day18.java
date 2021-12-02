//  HackerRank 30 Days of Code
//  Day 18: Queues and Stacks
//
// Created by Austin Swack
// Created on 12/2/2021
import java.util.LinkedList;
import java.util.Scanner;

public class Day18 {
  public LinkedList queue = new LinkedList();
  public LinkedList stack = new LinkedList();


  public void pushCharacter(char ch) {
    stack.push(String.valueOf(ch));
  }

  public void enqueueCharacter(char ch) {
    queue.add(String.valueOf(ch));
  }

  public char popCharacter() {
    String s = (String)stack.pop();
    return s.charAt(0);
  }

  public char dequeueCharacter() {
    String s = (String)queue.poll();
    return s.charAt(0);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    //String input = scan.nextLine();
    String input = "racecar";
    scan.close();

    char[] s = input.toCharArray();
    Day18 p = new Day18();

    for (char c : s) {
      p.pushCharacter(c);
      p.enqueueCharacter(c);
    }

    boolean isPalindrome = true;
    for (int i = 0; i < s.length/2; i++) {
      System.out.println(p.popCharacter());
      System.out.println(p.dequeueCharacter());
      if (p.popCharacter() != p.dequeueCharacter()) {
        isPalindrome = false;
        break;
      }
    }

    System.out.println( "The word, " + input + ", is "
        + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
  }
}