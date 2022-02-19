//  HackerRank Problem Solving - Algorithms
//  Implementation: Designer PDF Viewer (Easy)
//  https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
//  Created by Austin Swack
//  Created on 2/18/2022
import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Stream;

public class PDF {
  public static int designerPdfViewer(List<Integer> h, String word) {
    int largestChar = 0;
    int currentHeight;

    for (int i = 0; i < word.length(); i++) {
      currentHeight = h.get((int)word.charAt(i)-97);
      if (currentHeight > largestChar) {
        largestChar = currentHeight;
      }
    }
    return largestChar * word.length();
  }

  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new FileReader("Algorithms/data/PDF.txt"));

    List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
        .map(Integer::parseInt)
        .collect(toList());

    String word = bufferedReader.readLine();

    int result = designerPdfViewer(h, word);
    System.out.println(result);

    bufferedReader.close();
  }
}
