package praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private static IngredientType type;

    public IngredientTypeTest(IngredientType type) {
        IngredientTypeTest.type = type;
    }

    @Parameterized.Parameters
    public static Object[][] getTypeData() {
        return new Object[][]{
                {IngredientType.SAUCE},
                {IngredientType.FILLING}
        };
    }

    @Test
    public void getTypeShouldAcceptEnumValues() {
        Ingredient ingredient = new Ingredient(type, "Чесночный", 1.22f);
        IngredientType expected = ingredient.getType();
        assertEquals(expected, type);
    }
}