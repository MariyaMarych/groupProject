package Mentorings.Tuesday;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DataTime {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now(); //create a date object
        System.out.println(localDate);  //print 2020-05-30

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("before formatting  " + localDateTime);

    /*
yyyy-MM-dd	"1988-09-29"
dd/MM/yyyy	"29/09/1988"
dd-MMM-yyyy	"29-Sep-1988"
E, MMM dd yyyy	"Thu, Sep 29 1988"

     */


        //    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");
        String formatedDatev = localDateTime.format(dateTimeFormatter1);
        System.out.println("after formatting1 " + formatedDatev);

        //  System.out.println("after formating "+formatedDatev);


    }


}
