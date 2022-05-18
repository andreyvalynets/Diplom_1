package praktikum;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BunTest {

    @Test
    public void getNameTest(){
        Bun bun = new Bun("Булочка", (float) 1.21);
        String expectedName = "Булочка";
        String actualName = bun.getName();
        assertEquals(expectedName, actualName);
    }

    @Test
    public void getPriceTest(){
        Bun bun = new Bun("Булочка", (float) 1.21);
        float expectedPrice = (float) 1.21;
        float actualPrice = bun.getPrice();
        assertEquals(expectedPrice,actualPrice,0.0f);
    }

}