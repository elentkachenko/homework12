package com.itAcademy;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.*;

public class Main {

    public static void main(String[] args) {
        LocalDate examDay = LocalDate.of(2021, 10, 28);
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату в формате yyyy-MM-dd");
        String data = in.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate formatData = LocalDate.parse(data, formatter);

        if (examDay.equals(formatData)) {
            System.out.println("Экзамен сегодня.");
        } else if (examDay.isBefore(formatData)) {
            long l = formatData.getDayOfYear() - examDay.getDayOfYear();
            System.out.println("После экзамена прошло " + l + " дней.");
        } else if (examDay.isAfter(formatData)) {
            long l = examDay.getDayOfYear() - formatData.getDayOfYear();
            System.out.println("До экзамена осталось " + l + " дней.");
        }
    }
}
