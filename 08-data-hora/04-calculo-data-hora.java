package com.mycompany.calculo.data.hora;

/**
 * Data e hora em Java. 
 * Autor: Bernardo 
 * Data: Agosto de 2025
 */
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoDataHora {

    public static void main(String[] args) {
        LocalDate d04 = LocalDate.parse("2022-07-20");
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
        
        //Data-hora +/- tempo ➞ Data-hora
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);
        LocalDate nextYearLocalDate = d04.plusYears(7);
        
        LocalDateTime pastHourLocalDateTime = d05.minusHours(7);
        LocalDateTime nextMinuteLocalDateTime = d05.plusMinutes(7);
        
        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);
        
        System.out.println("PastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("NextWeekLocalDate = " + nextWeekLocalDate);
        System.out.println("NextYearLocalDate = " + nextYearLocalDate);
        
        System.out.println();
        System.out.println("NextYearLocalDateTime = " + pastHourLocalDateTime);
        System.out.println("NextYearLocalDateTime = " + nextMinuteLocalDateTime);
        
        System.out.println();
        System.out.println("NextYearLocalDateTime = " + pastHourLocalDateTime);
        System.out.println("NextYearLocalDateTime = " + nextMinuteLocalDateTime);
        
        System.out.println();
        System.out.println("PastWeekInstant = " + pastWeekInstant);
        System.out.println("NextWeekInstant = " + nextWeekInstant);
        
        
        //Data-hora 1, Data-hora 2 ➞ Duração
        //.atStartOfDay() converte o LocalDate para LocalDateTime
        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t2 = Duration.between(pastHourLocalDateTime, d05);
        Duration t3 = Duration.between(pastWeekInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekInstant);
        
        System.out.println();
        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 horas = " + t2.toHours());
        System.out.println("t3 anos = " + t3.toDays());
        System.out.println("t4 anos = " + t4.toDays());
    }
}
