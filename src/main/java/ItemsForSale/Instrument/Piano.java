package ItemsForSale.Instrument;

public class Piano extends Instrument{

    private int numberOfPedals;

    public Piano(InstrumentType instrumentType, String name, int costPrice, int sellPrice, int numberOfStrings) {
        super(instrumentType, name, costPrice, sellPrice);
        this.numberOfPedals = numberOfStrings;
    }

    public int getNumberOfPedals() {
        return numberOfPedals;
    }

    public String play() {
        return "Tinkle Tinkle";
    }
}
