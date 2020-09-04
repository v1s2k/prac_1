package ru.mirea.lab1;


public class Ball {
    private String name;
    private String color;
    private int year;

    public Ball(String n , String c,int y){
        name=n;
        color=c;
        year=y;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setColor(String Color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String toString(){
        return this.name+this.color+this.year;
    }
    public void info1(){
        System.out.println(name+" ball "+" is  "+color+" |Year of made ->>"+year);
    }


}

class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball("Basketball", "Orange",2015);
        Ball b2 = new Ball("Football", "White",2018);
        Ball b3 = new Ball("Football", "Red",2019);

        b1.info1();
        b2.info1();
        b3.info1();


    }
}