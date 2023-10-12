package org.example;


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Container.init();
        new App().run();
        Container.close();

    }
}