//  HackerRank 30 Days of Code
//  Day 15 - Linked Lists
//
// Created by Austin Swack
// Created on 11/29/2021
import java.util.Scanner;

class Node {
  int data;
  Node next;

  Node(int d) {
    data = d;
    next = null;
  }
}

public class Day15 {

  public static Node insert(Node head,int data) {
    if (head==null){
      return new Node(data);
    } else if (head.next == null) {
      head.next = new Node(data);
    } else insert(head.next, data);
    return head;
  }

  public static void display(Node head) {
    Node start = head;
    while(start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Node head = null;
    int N = sc.nextInt();

    while(N-- > 0) {
      int ele = sc.nextInt();
      head = insert(head,ele);
    }
    display(head);
    sc.close();
  }
}