package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        double expectedShoeSize = 9.0;
        int expectedWeight = 175;
        boolean expectedIsMale = true;
        char expectedGender = 'm';
        int expectedHeightInch = 67;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();
        double actualShoeSize = person.getShoeSize();
        int actualWeight = person.getWeight();
        boolean actualIsMale = person.isMale();
        char actualGender = person.getGender();
        int actualHeighInch = person.getHeightInch();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedShoeSize, actualShoeSize,.1);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedIsMale, actualIsMale);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedHeightInch, actualHeighInch);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAllArgs() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        double expectedShoeSize = 9.0;
        int expectedWeight = 175;
        boolean expectedIsMale = true;
        char expectedGender = 'm';
        int expectedHeightInch = 67;

        // When
        Person person = new Person(expectedName, expectedAge, expectedShoeSize, expectedWeight, expectedIsMale, expectedGender, expectedHeightInch);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        double actualShoeSize = person.getShoeSize();
        int actualWeight = person.getWeight();
        boolean actualIsMale = person.isMale();
        char actualGender = person.getGender();
        int actualHeighInch = person.getHeightInch();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedShoeSize, actualShoeSize,.1);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(expectedIsMale, actualIsMale);
        Assert.assertEquals(expectedGender, actualGender);
        Assert.assertEquals(expectedHeightInch, actualHeighInch);
    }


}
