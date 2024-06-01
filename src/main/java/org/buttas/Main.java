package org.buttas;

class Base {
    int x;

    public Base() {
        System.out.println("In Base");
    }

    public Base(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}

class Derived extends Base{
    int y;

    public Derived() {
        System.out.println("In Derived");
    }

    public Derived(int y) {
        this.y = y;
        System.out.println("In Derived");
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Main {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.setX(5);
        System.out.println(d.getX());

        d.setY(15);
        System.out.println(d.getY());

        Derived d1 = new Derived(100);

    };;
}