package com.kristoffer.test;

import com.kristoffer.unitTestInheritance.Student;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

// TODO - Check for automatic test class insertion
// This is our Test Class
class StudentTest {

    @Test
    public void myTest() {

        Student benny = new Student("Benny", 15, true);
        Student frida = null;

        assertEquals(benny.name, "Benny");
        assertNotNull(benny);
    }

}
