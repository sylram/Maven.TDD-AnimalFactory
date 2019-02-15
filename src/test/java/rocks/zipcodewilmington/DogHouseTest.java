package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Before

    public void clearHouse()

    {
        DogHouse.clear();
    }

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void testRemoveId() {
        // Given (some
        String name = "Kevin";
        Date birthDate = new Date();
        int givenId = 32;
        Dog kevin = new Dog(name,birthDate,givenId);


        // When
        DogHouse.add(kevin);
        int retrieved = kevin.getId();

        // Then
        Assert.assertEquals(givenId,retrieved);

    }
    @Test
    public void testRemoveDog() {
        // Given (some
        String name = "Kevin";
        Date birthDate = new Date();
        int givenId = 32;
        Dog kevin = new Dog(name, birthDate, givenId);


        // When
        DogHouse.add(kevin);
        DogHouse.remove(kevin);
        int retrieved = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(0, retrieved);

    }
    @Test
    public void testGetDogbyID() {
        // Given (some
        String name = "Bill";
        Date birthDate = new Date(03/20/1990);
        int givenId = 28;
        Dog bill = new Dog(name, birthDate, givenId);


        // When
        DogHouse.add(bill);

        int retrieved = bill.getId();

        // Then
        Assert.assertEquals(givenId, retrieved);
    }
    @Test
    public void testgetNumofDogs() {
        // Given (some

        Dog kevin = new Dog(null, null, null);
        Dog luna = new Dog(null, null, null);
        Dog bella = new Dog(null, null, null);
        DogHouse.add(kevin);
        DogHouse.add(luna);
        DogHouse.add(bella);
        int added = 3;

        // When


        int retrieved = DogHouse.getNumberOfDogs();

        // Then
        Assert.assertEquals(added, retrieved);
    }

}
