package task22.ex3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Family {
    public static void main(String[] args) {
        System.out.println("Бобр");
        Calendar calendar = new GregorianCalendar(2022, Calendar.DECEMBER, 10, 12, 41);
        Date date1 = calendar.getTime();
        System.out.println("Получил задание " + date1);
        Date date = new Date();
        System.out.println("Сдача задания " + date);

    }
}
