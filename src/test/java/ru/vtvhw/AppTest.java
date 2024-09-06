package ru.vtvhw;

import org.junit.jupiter.api.Test;
import ru.vtvhw.maven.MavenCircle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testClassFromExternalLib() {
        System.out.println("Test task: ");

        MavenCircle mavenCircle = new MavenCircle(4);
        System.out.printf("Maven Circle: %s%n", mavenCircle);
        System.out.printf("Circle's area = %f%n", mavenCircle.getArea());
        System.out.printf("Circle's length = %f%n", mavenCircle.getLength());
        assertEquals(4, mavenCircle.getRadius());
    }
}