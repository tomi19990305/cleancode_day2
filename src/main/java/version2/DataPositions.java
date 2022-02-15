package version2;

public class DataPositions {

    private int identifierPosition;

    private int firstDataPosition;

    private int secondDataPosition;

    public DataPositions(int identifierPosition, int firstDataPosition, int secondDataPosition) {
        this.identifierPosition = identifierPosition;
        this.firstDataPosition = firstDataPosition;
        this.secondDataPosition = secondDataPosition;
    }

    public int getIdentifierPosition() {
        return identifierPosition;
    }

    public void setIdentifierPosition(int identifierPosition) {
        this.identifierPosition = identifierPosition;
    }

    public int getFirstDataPosition() {
        return firstDataPosition;
    }

    public void setFirstDataPosition(int firstDataPosition) {
        this.firstDataPosition = firstDataPosition;
    }

    public int getSecondDataPosition() {
        return secondDataPosition;
    }

    public void setSecondDataPosition(int secondDataPosition) {
        this.secondDataPosition = secondDataPosition;
    }
}
