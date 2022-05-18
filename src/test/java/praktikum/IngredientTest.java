package praktikum;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IngredientTest {

    @Test
    public void getIngredientsAndNameTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Булочка", (float) 1.22);
        String expectedName = "Булочка";

        assertEquals(expectedName, ingredient.getName());
    }

    @Test
    public void getIngredientsAndPriceTest() {
        Ingredient ingredient = new Ingredient(IngredientType.SAUCE, "Булочка", (float) 1.22);
        float expectedPrice = (float) 1.22;

        assertEquals(expectedPrice, ingredient.getPrice(), 0.0f);

    }

}