import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class Main19 {
    public static void main(String[] args) {

        // How to write files using Java (4 popular options)

        // FileWriter           = Good for small or medium-sized text files
        // BufferedWriter       = Better performance for large amounts of text
        // PrintWriter          = Best for structured data, like reports or logs
        // FileOutputStream     = Best for binary files (e.g. images,audio files)

        String filePath = "test.txt";
        String fileContains = """
                This is file writing practise
                In JAVA
                """ ;

        try (FileWriter filewriter = new FileWriter(filePath)) {
            filewriter.write("This is a test1\n" + fileContains);
            System.out.println("file writes successfully");
        } catch (FileNotFoundException e){
            System.out.println("couldn't locate fle location");
        }
        catch (IOException e) {
            System.out.println("couldn't write file");
        }
    }
}
