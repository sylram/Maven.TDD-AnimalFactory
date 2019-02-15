package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */


public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Before

    public void clearHouse(){
        CatHouse.clear();
    }


    @Test
    public void testAdd() {
        // Given
        String givenName = "Lola";
        Cat lola = new Cat(givenName, null, null);
        int numOfCats = 1;
        CatHouse.add(lola);

        // When
        int actualNum = CatHouse.getNumberOfCats();

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(numOfCats, actualNum);


    }

    @Test
    public void testRemoveId() {
        // Given
        String givenName = "Nina";
        int numOfId = 4;
        Cat nina = new Cat(givenName, null, numOfId);

        CatHouse.add(nina);

        // When
        CatHouse.remove(numOfId);

        Cat retrieved = CatHouse.getCatById(4);

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(null, retrieved);


    }

    @Test
    public void testRemoveCat() {
        // Given
        String givenName = "Moni";
        int givenId = 23;
        Cat moni = new Cat(givenName, null, givenId);

        CatHouse.add(moni);

        // When
        CatHouse.remove(moni);

        Cat retrieved = CatHouse.getCatById(23);

        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(null, retrieved);
    }
    @Test
    public void testGetNumOfCats() {
        // Given

        Cat nina = new Cat(null, null, null);
        Cat rola = new Cat(null, null, null);
        Cat lentes = new Cat(null, null, null);

        CatHouse.add(nina);
        CatHouse.add(rola);
        CatHouse.add(lentes);
        int addedCats = 3;


        // When
        int numOfCats = CatHouse.getNumberOfCats();


        // Then (we expect to get the given name from the dog)
        Assert.assertEquals(addedCats,numOfCats);


    }


}
