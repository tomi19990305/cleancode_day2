package version2;

import java.nio.file.Path;

public class CleanCode {
    public static void main(String[] args) {
        DataPositions footballDataPositions = new DataPositions(2,7,9);
        String footballResult = new FileReader(1, "----", footballDataPositions).findSmallestDifference(Path.of("src/main/resources/datamunging/football.dat"));
        System.out.println(footballResult);

        DataPositions weatherDataPositions = new DataPositions(1,2,3);
        String weatherResult = new FileReader(2, "mo",weatherDataPositions).findSmallestDifference(Path.of("src/main/resources/datamunging/weather.dat"));
        System.out.println(weatherResult);
    }

}
