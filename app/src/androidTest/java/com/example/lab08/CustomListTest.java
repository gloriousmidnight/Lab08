package com.example.lab08;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
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

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City city = new City("Edmonton", "AB");
        list.addCity(city);
        assertTrue(list.hasCity(city));
        list.deleteCity(city);
        assertFalse(list.hasCity(city));
    }

    //@Test
    //public void testCountCities() {
        //CustomList list = new CustomList();
        //City city = new City("Vancouver", "BC");
        //list.addCity(city);
        //assertEquals(1, cityList.countCities());
        //list.addCity(new City("Red Deer", "AB"));
        //assertEquals(2, cityList.countCities());
    //}
}
