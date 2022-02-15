package version2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.stream.Stream;

public class FileReader {

    private int headerLinesCount;

    private DataPositions dataPositions;

    private static String invalidLineContent;

    public FileReader(int headerLinesCount, String invalidLineContent, DataPositions dataPositions) {
        this.headerLinesCount = headerLinesCount;
        this.invalidLineContent = invalidLineContent;
        this.dataPositions = dataPositions;
    }

    public String findSmallestDifference(Path path) {
        try (var lines = Files.lines(path)) {
            return findSmallest(lines);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    private String findSmallest(Stream<String> lines) {
        return lines
                .skip(headerLinesCount)
                .filter(FileReader::dataLine)
                .map(line -> DataItem.bindValues(line, dataPositions.getIdentifierPosition(), dataPositions.getFirstDataPosition(), dataPositions.getSecondDataPosition()))
                .min(Comparator.comparing(DataItem::getAbsDiff))
                .orElseThrow(FileReader::throwNoDataFound)
                .getIdentifier();
    }

    public static boolean dataLine(String s) {
        return !s.contains(invalidLineContent);
    }

    public static IllegalArgumentException throwNoDataFound() {
        return new IllegalArgumentException("No data line found");
    }
}
