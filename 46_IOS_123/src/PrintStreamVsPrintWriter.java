import java.io.*;
import java.util.stream.IntStream;

public class PrintStreamVsPrintWriter {
    private static final int N_Lines = 1_000_000;
    private static final String STRING = "1234567890";

    public static void main(String[] args) throws FileNotFoundException {
        testPrintStream();
        testPrintWriter();
        printFileSize();


    }

    private static void printFileSize() {
        File f1 = new File("fileForPrintWriter.txt");
        File f2 = new File("fileForPrintStream.txt");
        System.out.printf("Size of %s = %d bytes \n",f1.getName(),f1.length());
        System.out.printf("Size of %s = %d bytes \n",f2.getName(),f2.length());
    }

    private static void testPrintWriter() throws FileNotFoundException {
        try (PrintWriter wWriter = new PrintWriter("fileForPrintWriter.txt")) {
            long start = System.currentTimeMillis();
            IntStream.range(0, N_Lines).forEach(s -> wWriter.println(STRING));
            System.out.printf("running time for %s is %d\n", "Print writer",
                    (System.currentTimeMillis() - start));

        }
    }

    private static void testPrintStream() throws FileNotFoundException {
        try (PrintStream wStream = new PrintStream("fileForPrintStream.txt")) {
            long start = System.currentTimeMillis();
            IntStream.range(0, N_Lines).forEach(s -> wStream.println(STRING));
            System.out.printf("running time for %s is %d\n", "Print stream",
                    (System.currentTimeMillis() - start));
            
        }

    }
}
