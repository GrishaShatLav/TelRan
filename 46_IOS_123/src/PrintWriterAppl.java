import java.io.*;

public class PrintWriterAppl {
    public static void main(String[] args) throws IOException {
        try (BufferedReader bReader =
                     new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter file name>>>");
            String fileName = bReader.readLine();
            if (fileName == null || fileName.isBlank()) {
                System.out.println("No file name. Exiting...");
                return;
            }
            File outFile = new File(fileName + ".txt");
            try (PrintWriter pWriter = new PrintWriter(new FileWriter(outFile, true))) {
                System.out.println("Please write your poem here: ");
                for (String line = bReader.readLine();
                     line != null && !line.isEmpty();
                     line = bReader.readLine()) {
                    pWriter.println(line);
                    pWriter.flush();
                }
                System.out.println("Saved to: " + outFile.getPath());

            }
        }
    }
}
