//  HackerRank Problem Solving - Algorithms
//  Implementation: Flatland Space Stations (Easy)
//  https://www.hackerrank.com/challenges/flatland-space-stations/problem
//  Created by Austin Swack
//  Created on 12/31/2021
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SpaceStation {
  private static Scanner scan;

  static {
    try {
      scan = new Scanner(new File("Algorithms/data/SpaceStation.txt"));
    } catch (FileNotFoundException ignored) {

    }
  }

  public static void main(String[] args) {
    int cities = scan.nextInt();
    List<Integer> stations = new ArrayList<>(scan.nextInt());

    while(scan.hasNextInt()) {
      stations.add(scan.nextInt());
    }
    Collections.sort(stations);

    int maxDistance = 0;
    for (int i = 0; i < cities; i++) {
      int distances = cities;
      for (int station : stations) {
        int curDist = Math.abs(i-station);
        if (curDist < distances) {
          distances = curDist;
        }
      }
      if (distances > maxDistance) {
        maxDistance = distances;
      }
    }
    System.out.println(maxDistance);
  }
}