package com.example.lab08;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        //this will fail because hasCity() doesn't exist yet
        assertTrue(list.hasCity(calgary));
    }
}
