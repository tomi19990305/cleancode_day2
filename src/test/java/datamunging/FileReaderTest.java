package datamunging;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FileReaderTest {

    @Test
    void testFileReader() {
        String result = new FileReader().findSmallestGoalDifference(Path.of("src/main/resources/datamunging/football.dat"));
        //assertEquals(14, result);
    }
}
