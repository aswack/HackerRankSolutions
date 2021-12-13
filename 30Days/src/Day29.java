import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.IntStream;

class Day29Result {
  public static int bitwiseAnd(int N, int K) {
    int A = 0;
    int B = A+1;
    int max = 0;

    while(A < N) {
      int current = A & B;
      if(current < K && current > max)
        max = current;

      B++;

      if(B == N+1){
        A++;
        B = A+1;
      }
    }
    return max;
  }
}

public class Day29 {
  public static void main(String[] args) throws IOException {
    File input = new File("30Days/data/day29input.txt");
    File output = new File("30Days/data/day29output.txt");
    Scanner scan = new Scanner(input);
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output));

    int t = Integer.parseInt(scan.nextLine().trim());

    IntStream.range(0, t).forEach(tItr -> {
      try {
        String[] firstMultipleInput = scan.nextLine().replaceAll("\\s+$", "").split(" ");
        int count = Integer.parseInt(firstMultipleInput[0]);
        int lim = Integer.parseInt(firstMultipleInput[1]);
        int res =   Day29Result.bitwiseAnd(count, lim);
        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();
      } catch (Exception ex) {
        throw new RuntimeException(ex);
      }
    });
    scan.close();
    bufferedWriter.close();
  }
}
