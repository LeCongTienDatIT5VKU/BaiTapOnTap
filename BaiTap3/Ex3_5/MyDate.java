package BaiTap3.Ex3_5;

import java.util.Calendar;

public class MyDate {
    private int year, month, day;
    private static final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    private static final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    private static final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public MyDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date!");
        }
    }

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12 || day < 1) return false;
        int maxDay = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
        return day <= maxDay;
    }

    public int getDayOfWeek(int year, int month, int day) {
        Calendar cal = Calendar.getInstance();
        cal.set(year, month - 1, day);
        return cal.get(Calendar.DAY_OF_WEEK) - 1;
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid date!");
        }
    }

    public int getYear() { return year; }
    public int getMonth() { return month; }
    public int getDay() { return day; }

    public void setYear(int year) { this.year = year; }
    public void setMonth(int month) { this.month = month; }
    public void setDay(int day) { this.day = day; }

    @Override
    public String toString() {
        return DAYS[getDayOfWeek(year, month, day)] + " " + day + " " + MONTHS[month - 1] + " " + year;
    }

    public MyDate nextDay() {
        if (isValidDate(year, month, day + 1)) {
            day++;
        } else if (month == 12) {
            day = 1; month = 1; year++;
        } else {
            day = 1; month++;
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            month = 1; year++;
        } else {
            month++;
        }
        return this;
    }

    public MyDate nextYear() {
        if (month == 2 && day == 29 && !isLeapYear(year + 1)) {
            day = 28;
        }
        year++;
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else if (month == 1) {
            month = 12; day = 31; year--;
        } else {
            month--;
            day = (month == 2 && isLeapYear(year)) ? 29 : DAYS_IN_MONTHS[month - 1];
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            month = 12; year--;
        } else {
            month--;
        }
        return this;
    }

    public MyDate previousYear() {
        if (month == 2 && day == 29 && !isLeapYear(year - 1)) {
            day = 28;
        }
        year--;
        return this;
    }
}