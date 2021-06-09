package br.com.ks.labs.search;

import br.com.ks.labs.search.utils.UtilsString;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

/**
 * Unit test for simple App.
 */
public class UtilsStringTest {

    @Test
    public void shouldTestTransformation() {
        String[] args = {"Walt", "disney"};
        List<String> list = UtilsString.transformIntoList(args);

        assertEquals(Arrays.asList("Walt","disney"), list);
    }


    @Test
    public void shouldFailTransformationTest() {
        String[] args = {"Woody", "Buzz", "Buster" };
        List<String> list = UtilsString.transformIntoList(args);

        assertNotEquals(Arrays.asList("Woody", "Buzz"), list);

    }

    @Test
    public void shouldTestNullTransformation() {
        String[] args = {};
        List<String> list = UtilsString.transformIntoList(args);

        assertEquals(0, list.size());

    }



}
