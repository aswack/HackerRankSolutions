//  HackerRank 30 Days of Code
//  Day 24: More Linked Lists
//  https://www.hackerrank.com/challenges/30-linked-list-deletion/problem
//  Created by Austin Swack
//  Created on 12/8/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Node class in Day 15
class Day24 {

  public static Node removeDuplicates(Node head) {
    Node newHead = new Node(head.data);
    Node tempHead = new Node(head.data);

    while (head != null) {
      if (head.data != tempHead.data) {
        insert(newHead, head.data);
        insert(tempHead, head.data);
        tempHead = tempHead.next;
      }
      head = head.next;
    }
    return newHead;
  }

  public static Node insert(Node head,int data) {
    Node p = new Node(data);
    if(head == null)
      head = p;
    else if(head.next == null)
      head.next = p;
    else {
      Node start = head;
      while(start.next != null)
        start = start.next;
      start.next = p;
    }
    return head;
  }

  public static void display(Node head) {
    Node start = head;
    while(start != null) {
      System.out.print(start.data + " ");
      start = start.next;
    }
  }

  public static void main(String[] args) throws FileNotFoundException {
    File file = new File("30Days/data/day24input.txt");
    Scanner sc = new Scanner(file);
    Node head = null;
    int elements = sc.nextInt();
    while(elements --> 0){
      int ele = sc.nextInt();
      head = insert(head,ele);
    }
    assert head != null;
    head = removeDuplicates(head);
    display(head);
  }
}