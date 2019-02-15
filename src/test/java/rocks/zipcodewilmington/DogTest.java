package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import javax.xml.crypto.Data;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void testSpeak() {
        // Given (a name exists and a dog exists)
        String givenName = "Kevin";
        String sound = "bark!";
        Dog kevin = new Dog(givenName, null, null);


        // When (a dog's name is set to the given name)
        String kevinSound = kevin.speak();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(sound, kevinSound);
    }

    @Test
    public void testSetBirthday() {
        // Given (a name exists and a dog exists)
        String givenName = "Bella";
        Date dob = new Date(05 / 13 / 2015);
        Dog bella = new Dog(givenName, dob, 13);


        // When (a dog's name is set to the given name)
        Date newDob = new Date(05 / 05 / 2015);
        bella.setBirthDate(newDob);


        // Then (we expect to get the given name from the dog)
        Date retrieved = bella.getBirthDate();
        Assert.assertEquals(dob, retrieved);
    }

    @Test
    public void testEat() {
        // Given (a name exists and a dog exists)
        String givenName = "Wentz";
        Dog wentz = new Dog(givenName, null, null);
        int wentzAte = 1;


        // When (a dog's name is set to the given name)
        wentz.eat(new Food());
        int fed = wentz.getNumberOfMealsEaten();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(wentzAte, fed);
    }

    @Test
    public void testGetId() {
        // Given (a name exists and a dog exists)
        String givenName = "Bruno";
        int brunoId = 75;
        Dog bruno = new Dog(givenName, null, brunoId);


        // When (a dog's name is set to the given name)
        int numId = bruno.getId();

        // Then (we expect to get the given name from the dog)

        Assert.assertEquals(brunoId,numId);
    }

    @Test
    public void getClassInheritance() {
        // Given (a name exists and a dog exists)
        String givenName = "Luna";

        Dog luna = new Dog(givenName, null, null);


        // When (a dog's name is set to the given name)
       Boolean getClass = luna instanceof Animal;

        // Then (we expect to get the given name from the dog)

        Assert.assertTrue(getClass);
    }

    @Test
    public void getClassInheritance2() {
        // Given (a name exists and a dog exists)
        String givenName = "Jack";

        Dog jack = new Dog(givenName, null, null);


        // When (a dog's name is set to the given name)
        Boolean getClass = jack instanceof Mammal;

        // Then (we expect to get the given name from the dog)

        Assert.assertTrue(getClass);
    }
}



