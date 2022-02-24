//  HackerRank Java
//  Data Structures: Priority Queue
//  https://www.hackerrank.com/challenges/java-priority-queue/problem
//  Created by Austin Swack
//  Created on 2/24/2022
import java.io.*;
import java.util.*;

class StudentPQ implements Comparable<StudentPQ> {
  private int id;
  private String name;
  private double cgpa;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getCgpa() {
    return cgpa;
  }

  public void setCgpa(double cgpa) {
    this.cgpa = cgpa;
  }

  public StudentPQ(int id, String name, double cgpa) {
    this.id = id;
    this.name = name;
    this.cgpa = cgpa;
  }

  @Override
  public int compareTo(StudentPQ s) {
    if (cgpa == s.getCgpa()) {
      if (name.equals(s.getName())) {
        return Integer.compare(id, s.getId());
      } else {
        return name.compareTo(s.getName());
      }
    } else {
      // Reversed order to send higher GPAs to the front of the queue
      return Double.compare(s.getCgpa(), cgpa);
    }
  }
}

class Priorities {
  public List<StudentPQ> getStudents(List<String> events) {
    PriorityQueue<StudentPQ> students = new PriorityQueue<>();

    for (String event : events) {
      String[] e = event.split(" ");
      if (e[0].equals("ENTER")) {
        StudentPQ s = new StudentPQ(Integer.parseInt(e[3]), e[1], Double.parseDouble(e[2]));
        students.add(s);
      } else {
        students.poll();
      }
    }

    ArrayList<StudentPQ> studentList = new ArrayList<>();

    while (!students.isEmpty()) {
      studentList.add(students.poll());
    }

    return studentList;
  }
}

public class PriorityQ {
  public static void main (String[] args) throws IOException {
    final Scanner scan = new Scanner(new File("Java/data/PriorityQueue.txt"));
    final Priorities priorities = new Priorities();

    int totalEvents = Integer.parseInt(scan.nextLine());
    List<String> events = new ArrayList<>();

    while (totalEvents-- != 0) {
      String event = scan.nextLine();
      events.add(event);
    }

    List<StudentPQ> students = priorities.getStudents(events);

    if (students.isEmpty()) {
      System.out.println("EMPTY");
    } else {
      for (StudentPQ st: students) {
        System.out.println(st.getName());
      }
    }
  }
}