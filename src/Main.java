import java.io.*;

public class Main {
    public static void main(String[] args) {
        String inputFilePath ="./input.txt";
        String outputFilePath = "./Output.txt";

        String content="";
        try {
            FileInputStream fis = new FileInputStream(inputFilePath);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String text ="";
            while ((text = br.readLine()) != null) {
                System.out.println("Read from file: " + text);
                content+=text;
            }
            br.close();
            fis.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file does not exist.");

        } catch (IOException e) {
            System.err.println("Error: An I/O exception occurred.");

        }

        try {
            FileOutputStream fos = new FileOutputStream(outputFilePath);
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
            bw.write(content);
            System.out.println("Successfully wrote to the file.");
            bw.close();
            fos.close();
        } catch (FileNotFoundException e) {
            System.err.println("Error: The file could not be created or opened.");

        } catch (IOException e) {
            System.err.println("Error: An I/O error occurred while writing to the file.");

        }
    }
}