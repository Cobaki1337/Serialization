package by.gsu.laba3;

import java.io.Serializable;

public class Date implements Serializable {

    private int monthDay;
    private int month;
    private int year;
    private int totalDate;  //for action

    public Date(int monthDay, int month, int year) {
        this.monthDay = monthDay;
        this.month = month;
        this.year = year;
    }

    public int getMonthDay() {
        return monthDay;
    }

    public void setMonthDay(int monthDay) { this.monthDay = monthDay; }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() { return year; }

    public void setYear(int year) {
        this.year = year;
    }

    public int getTotalDate() {
        return monthDay + month + year;
    }

    @Override
    public String toString() {
        return "Date{" +
                "monthDay=" + monthDay +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
