package datamunging;

public class DataItem {

    private String teamName;

    private int F;

    private int A;

    public static DataItem bindValues(String line) {
        DataItem dataItem = new DataItem();
        String[] cols = line.split("\\s+");

        dataItem.teamName = cols[2];
        dataItem.F = Integer.parseInt(cols[7]);
        dataItem.A = Integer.parseInt(cols[9]);

        return dataItem;
    }

    public int diff() {
        return Math.abs(F - A);
    }

    public String getTeamName() {
        return teamName;
    }

}
