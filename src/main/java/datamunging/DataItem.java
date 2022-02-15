package datamunging;

public class DataItem {

    private String teamName;

    private int F;

    private int A;

    public static DataItem of(String line) {
        System.out.println(line);
        DataItem dataItem = new DataItem();
        String[] cols = line.split("\\s+");

        dataItem.teamName = cols[1];
        dataItem.F = Integer.parseInt(cols[6]);
        dataItem.A = Integer.parseInt(cols[8]);

        return dataItem;
    }

    public int diff() {
        return F - A;
    }

    public String getTeamName() {
        return teamName;
    }

}
