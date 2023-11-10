package ItemsForSale.Instrument;

public class Guitar extends Instrument{

    private int numberOfStrings;

    public Guitar(InstrumentType instrumentType, String name, int costPrice, int sellPrice, int numberOfStrings) {
        super(instrumentType, name, costPrice, sellPrice);
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }


    @Override
    public String play() {
        return "Strum";
    }
}
