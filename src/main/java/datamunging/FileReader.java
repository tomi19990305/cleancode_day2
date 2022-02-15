package datamunging;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

public class FileReader {

    private static final int HEADER_LINES_NO = 1;

    public String findSmallestGoalDifference(Path path) {
        try (var lines = Files.lines(path)) {
            return findSmallest(lines);
        }
        catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String findSmallest(Stream<String> lines) {
        return lines
                .skip(HEADER_LINES_NO)
                .filter(FileReader::dataLine)
                .map(DataItem::bindValues)
                .min(Comparator.comparing(DataItem::diff))
                .orElseThrow(FileReader::throwNoDataFound)
                .getTeamName();
    }

    public static boolean dataLine(String s) {
        return s.matches(".*[a-zA-Z].*");
    }

    public static IllegalArgumentException throwNoDataFound() {
        return new IllegalArgumentException("No data line found");
    }

}
