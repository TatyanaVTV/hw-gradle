package ru.vtvhw;

import org.junit.jupiter.api.Test;
import ru.vtvhw.maven.MavenCircle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {
    @Test
    public void testClassFromExternalLib() {
        System.out.println("Test task: ");

        MavenCircle mavenCircle = new MavenCircle(4);
        System.out.println(mavenCircle);
        assertEquals(4, mavenCircle.getRadius());
    }
}