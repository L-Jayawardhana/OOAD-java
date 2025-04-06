import javax.sound.sampled.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    public static void main(String[] args) {

        // How to PLAY AUDIO with java (.wav , .au , .aiff)
        String filePath = "C:\\Users\\lakdi\\OneDrive\\Desktop\\SLIIT\\Y2_S1\\OOAD\\OOAD-java\\practice examples\\priyawee-piyath-rajapakse.wav";
        File file = new File(filePath);

        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file)){

            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);

            String choice ="";
            while(!choice.equals("Q")){
                System.out.println("P - Play");
                System.out.println("S - Stop");
                System.out.println("R - Reset");
                System.out.println("Q - Quit");
                System.out.print("Enter choice : ");
                choice = scanner.next().toUpperCase();

                switch(choice){
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Invalid choice");
                }
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found");
        } catch (LineUnavailableException e) {
            System.out.println("Unable to access audio stream");
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio Format not supported");
        } catch (IOException e){
            System.out.println("something went wrong");
        } finally {
            System.out.println("End..!");
        }
    }
}
