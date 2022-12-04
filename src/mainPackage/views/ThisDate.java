package mainPackage.views;

import java.io.PrintStream;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThisDate {

    public static void getDate() {
        PrintStream printStream = new PrintStream(System.out);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM yyyy года");
        LocalDate date = LocalDate.now();
        printStream.println(dateTimeFormatter.format(date));
        printStream.println("С возвращением!");
    }

}
