package Practic.src.ru.mirea.task20;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class DateAndCalendar {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat ft = new SimpleDateFormat ("yyyy.MM.dd hh:mm:ss");
        System.out.println("Введите дату в формате Год.Месяц.Число Часы:Минуты:Секунды");
        String str = sc.nextLine();
        Date parsingDate;
        parsingDate = ft.parse(str);
        System.out.println(parsingDate);
        Calendar calendar = new GregorianCalendar(2020, 11 , 30, 18, 00, 30);
        Date date = calendar.getTime();
        System.out.println(date + " Calendar date\n\n");

        String surname = "Шатов";
        Calendar calendar2 = new GregorianCalendar(2021, 11 , 1, 18, 00, 00);
        Date date2 = calendar2.getTime();
        Date dateNow = new Date();
        System.out.println(surname + " получил задание в " + date2 + ", а сдал в " + dateNow);
    }
}
