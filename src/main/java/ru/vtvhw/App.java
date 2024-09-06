package ru.vtvhw;

import ru.vtvhw.maven.MavenCircle;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MavenCircle mavenCircle = new MavenCircle(2);
        System.out.println(mavenCircle);
    }
}