package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    @Test
    public void testCreateDog() {
        // Given
        String givenName = "Bella";
        Date dob = new Date(2010);
        Dog bella = AnimalFactory.createDog(givenName, dob);




        // When
        String retrieve = bella.getName();
        Date retrieved = bella.getBirthDate();

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(givenName,retrieve);
        Assert.assertEquals(dob,retrieved);

    }




    @Test
    public void testCreateCat() {
        // Given
        String givenName = "Kitty";
        Date dob = new Date(2017);
        Cat kitty = AnimalFactory.createCat(givenName, dob);



        // When
        String retrieve = kitty.getName();
        Date retrieved = kitty.getBirthDate();

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(dob,retrieved);
        Assert.assertEquals(givenName,retrieve);
    }
}