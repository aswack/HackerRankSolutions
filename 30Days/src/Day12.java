//  HackerRank 30 Days of Code
//  Day 12 - Inheritance
//
// Created by Austin Swack
// Created on 11/26/2021
import java.util.*;

class Child {
  protected String firstName;
  protected String lastName;
  protected int idNumber;

  Child(String firstName, String lastName, int identification){
    this.firstName = firstName;
    this.lastName = lastName;
    this.idNumber = identification;
  }

  public void printPerson(){
    System.out.println("Name: " + lastName + ", " + firstName + 	"\nID: " + idNumber);
  }
}

class Student extends Child {
  private int[] testScores;

  public Student(String firstName, String lastName, int id, int[] testScores){
    super(firstName, lastName, id);
    this.testScores = testScores;
  }

  public char calculate() {
    int sum = 0;
    for (int grade : testScores) {
      sum += grade;
    }
    int average = sum/testScores.length;

    if (average >= 90 && average <= 100) return 'O';
    else if (average >= 80 && average < 90) return 'E';
    else if (average >= 70 && average < 80) return 'A';
    else if (average >= 55 && average < 70) return 'P';
    else if (average >= 40 && average < 55) return 'D';
    else if (average < 40) return 'T';

    return 'Z';
  }
}

public class Day12 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String firstName = scan.next();
    String lastName = scan.next();
    int id = scan.nextInt();
    int numScores = scan.nextInt();
    int[] testScores = new int[numScores];
    for(int i = 0; i < numScores; i++){
      testScores[i] = scan.nextInt();
    }
    scan.close();

    Student s = new Student(firstName, lastName, id, testScores);
    s.printPerson();
    System.out.println("Grade: " + s.calculate() );
  }
}