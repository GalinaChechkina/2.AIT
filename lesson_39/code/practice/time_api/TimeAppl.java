package practice.time_api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;

public class TimeAppl {
    public static void main(String[] args) {
        //          Date Formatter
        //          Парсинг даты из строки

        LocalDate currentDay= LocalDate.now(); // узнать текущую дату
        System.out.println(currentDay);
        LocalTime currentTime= LocalTime.now();// узнать текущуee время
        System.out.println(currentTime);
        LocalDateTime localDateTime= LocalDateTime.now();// узнать текущую дату и время
        System.out.println(localDateTime);

        LocalDate date= LocalDate.of(1961,04,12);// есть дата
        System.out.println(date);
        System.out.println(date.getEra());// какая эра?
        System.out.println(date.getDayOfWeek());// какой это был день недели?
        System.out.println(date.getDayOfYear());// день года?

        System.out.println(date.isBefore(currentDay));// есть дата, это было раньше?
        System.out.println(date.isAfter(currentDay));// или позже?

        System.out.println("------Traveling in Time-----");
        LocalDate newDate= currentDay.plusDays(50);// посчитали дату +50 дней
        System.out.println(newDate);
        newDate=currentDay.plusWeeks(12);// посчитали дату +12 недель
        System.out.println(newDate);
        newDate=currentDay.minusMonths(5);// посчитали дату -5 месяцев
        System.out.println(newDate);

        System.out.println(localDateTime.plus(9, ChronoUnit.HALF_DAYS));// использование ChronoUnit (какая дата будет через 9 полдней)
        System.out.println(localDateTime.minus(9, ChronoUnit.HOURS));// использование ChronoUnit (какая дата была 9 часов назад)

        newDate=currentDay.plus(10,ChronoUnit.CENTURIES);
        System.out.println(newDate.getDayOfWeek());

        LocalDate date1=LocalDate.of(1879,3,14);//  Получение интервала времени, сколько лет прошло
        long res=ChronoUnit.YEARS.between(date1,date);
        System.out.println(res);

        System.out.println("-------Compare dates------");
        System.out.println(date1.compareTo(date));
        LocalDate yesterday=LocalDate.of(2023,10,30);
        System.out.println(yesterday.compareTo(currentDay));

        System.out.println("-----Sort-----");
        LocalDate[]dates={yesterday,date1,date,currentDay};// Сортировка массива по времени
        System.out.println(Arrays.toString(dates));
        Arrays.sort(dates);
        System.out.println(Arrays.toString(dates));

        System.out.println();
        System.out.println("--------DateTimeFormatter--------");
        DateTimeFormatter formatter= DateTimeFormatter.ISO_DATE;
        System.out.println(date.format(formatter));
        formatter=DateTimeFormatter.ofPattern("dd MM uuuu");
        System.out.println(date.format(formatter));
        formatter=DateTimeFormatter.ofPattern("dd MMM uuuu");
        System.out.println(date.format(formatter));

        System.out.println();
        System.out.println("------Parsing------");
        String str="01/11/2023";
        System.out.println(str);
        LocalDate date2=dateParse(str);
        System.out.println(date2);
        System.out.println(date2.getDayOfWeek());
    }

    private static LocalDate dateParse(String s){ //метод конвертации строки в дату
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("[dd:MM:yyyy]" +
                "[dd MM yyyy][dd/MM/yyyy][yyyy-MM-dd]");
        return LocalDate.parse(s,formatter);//преобразование в дату

    }
}
