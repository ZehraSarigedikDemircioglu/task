package org.example;

public class Main implements Test{
    public static void main(String[] args) {

        Test name = new Main();
        name.abc();
        System.out.println(name.xyx(5));
    }


    @Override
    public void abc() {

    }

    @Override
    public Boolean xyx(int a) {
        return null;
    }
}