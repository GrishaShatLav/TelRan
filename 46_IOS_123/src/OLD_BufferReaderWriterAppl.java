import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class OLD_BufferReaderWriterAppl {

    public static void main(String[] args) throws IOException {
        File src = new File("result1.txt");

        BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bWriter = new BufferedWriter(new FileWriter(src));

        while (true) {
            System.out.println("Enter numbers separated by space or type exit>>>");
            String line = bReader.readLine();
            if (line == null || line.equalsIgnoreCase("exit")) {
                System.out.println("Exiting......");
                break;
            }
            if (line.isBlank()) {// "" isEmpty " " isBlank
                System.out.println("Please enter number!!!!");
                continue;
            }
            String[] numbers = line.trim().split("\\D+");
            int sum = Arrays.stream(numbers).filter(s -> !s.isEmpty()).mapToInt(Integer::parseInt).sum();
            System.out.println("sum = " + sum);
            bWriter.write("sum = " + sum);
            bWriter.newLine();
            bWriter.flush();

        }
        bWriter.close();
    }

}
