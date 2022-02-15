package version2;

public class DataItem {

    private String identifier;

    private int firstData;

    private int secondData;

    public static DataItem bindValues(String line, int indexOfIdentifier, int indexOfFirstData, int indexOfSecondData) {
        DataItem dataItem = new DataItem();
        String[] cols = line.split("\\s+");

        dataItem.identifier = cols[indexOfIdentifier];
        dataItem.firstData = Integer.parseInt(cols[indexOfFirstData].replaceAll("[^\\d.]", ""));
        dataItem.secondData = Integer.parseInt(cols[indexOfSecondData].replaceAll("[^\\d.]", ""));

        return dataItem;
    }

    public int getAbsDiff() {
        return Math.abs(firstData - secondData);
    }

    public int getDiff() {
        return firstData - secondData;
    }

    public String getIdentifier() {
        return identifier;
    }
}
