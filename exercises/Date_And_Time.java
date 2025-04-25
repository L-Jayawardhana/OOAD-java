import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date_And_Time {
    public static void main(String[] args) {
        // How to work with DATES & TIMES using JAVA
        // (LocalDate , LocalTime , LocalDateTime , UTC timestamp , DateTimeFormatter)


        // Create a LocalDate object for the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Create a LocalTime object for the current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Time: " + currentTime);

        // Create a LocalDateTime object for the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // Create a UTC timestamp
        Instant instant = Instant.now();
        System.out.println("Current UTC Timestamp: " + instant);

        // Format the date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = currentDateTime.format(formatter);
        System.out.println("Formatted Date and Time: " + formattedDateTime);

        // Parse a date string into a LocalDate object
        String dateString = "2023-10-01";
        LocalDate parsedDate = LocalDate.parse(dateString);
        System.out.println("Parsed Date: " + parsedDate);

        //compare two dates
        LocalDate date1 = LocalDate.of(2023, 10, 1);
        LocalDate date2 = LocalDate.of(2023, 10, 1);

        if(date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if(date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)){
            System.out.println(date1 + " is equal to " + date2);
        }
   }
}
