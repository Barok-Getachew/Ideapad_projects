package files;

import frames.DayYearConverter;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class History_write_read {
    String ConversionHistory;


    public History_write_read(String ConversionHistory) {
        this.ConversionHistory = ConversionHistory;

    }
    public History_write_read(){

    }

    public void History_Directory() {
        try {
            String dirname = "C:\\JavaProject\\History";
            File d = new File(dirname); // Create directory now
            if (d.mkdirs()) {
                System.out.println("Directory is created");
            } else {
                System.out.println("Directory cannot be created");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void History_WRITE() {
        try {
            LocalDateTime currentDateTime = LocalDateTime.now();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String formattedDateTime = currentDateTime.format(formatter);



            File file = new File("C:\\JavaProject\\History\\history.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            PrintWriter writeHistory = new PrintWriter(fileWriter);

            writeHistory.printf(ConversionHistory + "   " + formattedDateTime + "\n");
            writeHistory.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public  ArrayList<String> History_READ() {
        ArrayList<String> list = null;
        try {
            File file = new File("C:\\JavaProject\\History\\history.txt");
            Scanner scanner = new Scanner(file);
            list = new ArrayList<String>();
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            scanner.close(); // Close the Scanner after reading
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}
