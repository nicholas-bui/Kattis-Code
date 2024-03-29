import java.util.*;
import java.io.*;

public class SquarePeg {
    public static void main(String[] args) throws IOException {
        BufferedReader nya = new BufferedReader(new InputStreamReader(System.in));
        int[] data = Arrays.stream(nya.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        System.out.println(Math.sqrt(2)*data[0] <= data[1]*2 ? "fits" : "nope");
    }
}
