package hust.soict.hedspi.aims.utils;

import java.time.LocalDate;
import java.time.Month;

public class myDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    LocalDate currentdate = LocalDate.now();
    public myDate(){
        this.day = currentdate.getDayOfMonth();
        this.month = currentdate.getMonthValue();
        this.year = currentdate.getYear();
    }

    myDate(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void print(){
        System.out.println("Local time: " + LocalDate.now());
    }

}
