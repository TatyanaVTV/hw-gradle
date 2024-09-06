package ru.vtvhw;

import ru.vtvhw.maven.MavenCircle;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MavenCircle mavenCircle = new MavenCircle(2);
        System.out.printf("Maven Circle: %s%n", mavenCircle);
        System.out.printf("Circle's area = %f%n", mavenCircle.getArea());
        System.out.printf("Circle's length = %f%n", mavenCircle.getLength());
    }
}