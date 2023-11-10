package ItemsForSale.Instrument;

public class Drums extends Instrument{

    private int numberOfDrums;

    public Drums(InstrumentType instrumentType, String name, int costPrice, int sellPrice, int numberOfDrums) {
        super(instrumentType, name, costPrice, sellPrice);
        this.numberOfDrums = numberOfDrums;
    }

    public int getNumberOfDrums() {
        return numberOfDrums;
    }

    @Override
    public String play() {
        return "Bash";
    }
}
