package linter;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testNoErrors() throws IOException{
        List<String> errors = App.erorrMethod("test1.js");
        List<String> expectedError = new ArrayList<>();
        assertEquals(expectedError.size(),errors.size());
    }

    @Test
    void testFileOneError() throws IOException {
        List<String> errors = App.erorrMethod("test2.js");
        List<String> expectedError = new ArrayList<>();
        expectedError.add("Line 11: Missing semicolon");

        assertEquals(expectedError.size(),errors.size());
    }

    @Test
    void testFewErrors() throws IOException{
        List<String> errors = App.erorrMethod("test3.js");
        assertEquals(3, errors.size());
        assertEquals("Line 8: Missing semicolon", errors.get(0));
        assertEquals("Line 9: Missing semicolon", errors.get(1));
        assertEquals("Line 13: Missing semicolon", errors.get(2));

    }

    @Test
    void testManyErrors() throws IOException{

        List<String> errors = App.erorrMethod("test4.js");
        assertEquals(6, errors.size());
        assertEquals("Line 2: Missing semicolon", errors.get(0));
        assertEquals("Line 6: Missing semicolon", errors.get(1));
        assertEquals("Line 10: Missing semicolon", errors.get(2));
        assertEquals("Line 11: Missing semicolon", errors.get(3));
        assertEquals("Line 20: Missing semicolon", errors.get(4));
        assertEquals("Line 21: Missing semicolon", errors.get(5));

    }

    @Test
    void testEmptyFile() throws IOException{
        List<String> errors = App.erorrMethod("test5.js");
        assertEquals(1, errors.size());
        assertEquals("Empty File", errors.get(0));
    }
}
