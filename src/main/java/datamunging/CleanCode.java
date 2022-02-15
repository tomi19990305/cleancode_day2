package datamunging;

import java.nio.file.Path;

public class CleanCode {
    public static void main(String[] args) {
        String result = new FileReader().findSmallestGoalDifference(Path.of("src/main/resources/datamunging/football.dat"));
        System.out.println(result);
    }

}
