//  HackerRank Java
//  Data Structures: Java Sort
//
// Created by Austin Swack
// Created on 12/5/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


class HighSchoolStudent {
  private final int ID;
  private final String FIRST_NAME;
  private double gpa;

  public HighSchoolStudent(int id, String firstName, double gpa) {
    super();
    this.ID = id;
    this.FIRST_NAME = firstName;
    this.gpa = gpa;
  }
  public int getId() {
    return ID;
  }
  public String getFname() {
    return FIRST_NAME;
  }
  public double getGPA() {
    return gpa;
  }
}

public class JavaSort {

  public static void main(String[] args) throws FileNotFoundException {
    File input = new File("Java/data/JavaSort.txt");
    Scanner in = new Scanner(input);
    int testCases = Integer.parseInt(in.nextLine());

    List<HighSchoolStudent> studentList = new ArrayList<>();
    while(testCases>0){
      int id = in.nextInt();
      String fname = in.next();
      double cgpa = in.nextDouble();

      HighSchoolStudent st = new HighSchoolStudent(id, fname, cgpa);
      studentList.add(st);

      testCases--;
    }

    Comparator<HighSchoolStudent> comparatorName = Comparator.comparing(HighSchoolStudent::getFname); // Method Reference
    Comparator<HighSchoolStudent> comparatorID = Comparator.comparing(st -> st.getId()); // Lambda
    Comparator<HighSchoolStudent> comparatorGPA = Comparator.comparing(st -> st.getGPA());

    studentList.sort(comparatorID);
    studentList.sort(comparatorName);
    studentList.sort(comparatorGPA.reversed());

    for(HighSchoolStudent st: studentList){
      System.out.println(st.getFname());
    }
  }
}