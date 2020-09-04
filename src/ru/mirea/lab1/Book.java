package ru.mirea.lab1;
import java.lang.*;
public class Book {
    private String author;
    private int year;
    private String type;
    private String name;


    public Book(String au, int y, String t,String nt) {
        author = au;
        year = y;
        type = t;
        name=nt;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public void setName(String author) {
        this.name = name;
    }

    public void setType(String Type) {
        this.type = type;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return this.author + this.type + this.year;
    }

    public void info1() {
        System.out.println(name + " |Автор -> " + author + " |Год публикации ->>" + year+" год"+" |Тип произведения -> "+type);
    }
}
class TestBook {
    public static void main(String[] args) {
        Book b1 = new Book("Лев Толстой",1867,"Роман-эпопея","Война и Мир");


        b1.info1();



    }
}