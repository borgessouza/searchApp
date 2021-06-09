package br.com.ks.labs.search;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SearchEngineTest {

    private SearchEngine engine = new SearchEngine();

    @Test
    public void shouldTestArgsIntoLine() {
        String line = "13 lakes 2004  james benning";
        List<String> args = Arrays.asList("lakes", "2004");
        Assert.assertTrue(engine.findInLine(args, line));
    }



    @Test
    public void shouldFailTestArgsIntoLine() {
        String line = "13 lakes 2004  james benning";
        List<String> args = Arrays.asList("lakes", "2004", "Jones");
        Assert.assertFalse(engine.findInLine(args, line));
    }



    @Test
    public void shouldTestFailManyArgsIntoLine() {
        String line = "zombie bloodbath 2: rage of the undead 1995 dave miller kathleen mcsweeney gena fischer todd sheets todd sheets todd sheet";
        List<String> args = Arrays.asList("lakes", "2004");
        Assert.assertFalse(engine.findInLine(args, line));
    }

    @Test
    public void shouldTest10ArgsIntoLine() {
        String line = "zombie bloodbath 2: rage of the undead 1995 dave miller kathleen mcsweeney gena fischer todd sheets todd sheets todd sheet";
        List<String> args = Arrays.asList("rage", "dave", "zombie", "fischer", "sheet", "gena", "sheets", "1995", "2:", "zombie");
        Assert.assertTrue(engine.findInLine(args, line));
    }



}
