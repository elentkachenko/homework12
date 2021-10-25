package com.itAcademy;

import java.time.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(isDateOdd());
    }


    public static boolean isDateOdd (){
        LocalDate firstDay = LocalDate.of(2021, 01, 07);
        return firstDay.getDayOfYear() % 2 !=0;
    }
}
