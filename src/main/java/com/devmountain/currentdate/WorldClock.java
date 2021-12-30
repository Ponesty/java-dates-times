package com.devmountain.currentdate;

import java.time.*;

public class WorldClock {

    public LocalDate getNowForDate() {
        return LocalDate.now();
    }

    public LocalDateTime getNowForDateAndTime() {
        return LocalDateTime.now();
    }

    public DayOfWeek getDayOfWeekForNow() {
        return LocalDate.now().getDayOfWeek();
    }

    public int getDayOfMonthForNow() {
        return LocalDate.now().getDayOfMonth();
    }

    public int getDayOfYearForNow() { return LocalDate.now().getDayOfYear();}

    public ZonedDateTime getNowDateTimeForNewYork() {
        return ZonedDateTime.now(ZoneId.of("America/New_York"));
    }

    public ZonedDateTime getNowDateTimeForLA() {
        return ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
    }

    public ZonedDateTime getNowDateTimeForLondon() {
        return ZonedDateTime.now(ZoneId.of("Europe/London"));
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        return ZonedDateTime.now(ZoneId.of("Europe/Moscow"));
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        return ZonedDateTime.now(ZoneId.of("Asia/Tokyo"));
    }



}
