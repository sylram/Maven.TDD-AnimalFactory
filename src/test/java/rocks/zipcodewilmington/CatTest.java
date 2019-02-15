package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import java.util.HashSet;
import java.util.Set;
import java.lang.Object;

import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.ArrayList;
import java.util.Date;
import java.lang.Class;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void testSetName() {
        //Given
        Cat helloCat = new Cat("Hello", new Date(04 / 05 / 2010), 15);


        //When
        String newName = "Katy";
        helloCat.setName(newName);

        //Then
        String retrivedName = helloCat.getName();
        Assert.assertEquals(retrivedName, newName);

    }

    @Test
    public void testSpeak() {
        // Given (cat data)
        Cat katy = new Cat("Katy", new Date(05 / 20 / 98), 16);


        // When (a cat is constructed)
        String skills = katy.speak();

        // When (we retrieve data from the cat)


        // Then
        Assert.assertEquals("meow!", skills);
    }

    @Test
    public void testSetBirthday() {
        // Given (cat data)
        Cat lina = new Cat("Lina", new Date(05 / 21 / 2000), 17);


        // When (a cat is constructed)
        Date newDate = new Date(05 / 21 / 1999);
        lina.setBirthDate(newDate);
        // When (we retrieve data from the cat)


        // Then
        Date retrieved = lina.getBirthDate();
        Assert.assertEquals(newDate, retrieved);

    }
    @Test
    public void testCatEats(){

    String catName = "Mimi";
    Date dob = new Date (03/10/1980);
    int newId = 20;

    // When (a cat is constructed)
        Cat mimi = new Cat(catName,dob,newId);
        int beforeEat= mimi.getNumberOfMealsEaten();


    // When (we retrieve data from the cat)
        mimi.eat(new Food());


    // Then
        int afterEat = mimi.getNumberOfMealsEaten();
        Assert.assertEquals(beforeEat+1,afterEat);
    }

    @Test
    public void testGetId() {

        String catName = "Roco";
        Date dob = new Date(07 / 10 / 2010);
        int givenId = 30;

        // When (a cat is constructed)
        Cat roco = new Cat(catName, dob, givenId);


        // When (we retrieve data from the cat)
        int retrieved = roco.getId();

        // Then

        Assert.assertEquals(givenId, retrieved);

    }
    @Test
    public void testInheritage(){
        // Given (cat data)


        // When (a cat is constructed)
        Cat norma = new Cat("Norma",new Date(2000),45);
        Boolean itsClass = true;

        // When (we retrieve data from the cat)
        Class inhe = Cat.class.getSuperclass();
        Boolean verdad = norma instanceof Animal;

        // Then (we expect
        Assert.assertTrue(verdad);
    }
    @Test
    public void testInheritage1(){
        // Given (cat data)
        String givenClass = "Mammal";

        // When (a cat is constructed)
        Cat titi = new Cat("Titi",new Date(2019),23);


        // When (we retrieve data from the cat)
        Class getClass = Cat.class.getSuperclass();
        Boolean verdad = titi instanceof Mammal;

        // Then (we expect
        Assert.assertTrue(verdad);
    }


}
