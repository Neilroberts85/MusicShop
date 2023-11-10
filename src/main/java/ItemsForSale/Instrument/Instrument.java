package ItemsForSale.Instrument;

import Interfaces.IPlay;
import Interfaces.ISell;
import ItemsForSale.SellableItem;

public abstract class Instrument extends SellableItem implements IPlay, ISell {
    private InstrumentType instrumentType;

    public Instrument(InstrumentType instrumentType, String name, int costPrice, int sellPrice) {
        super(name, costPrice, sellPrice);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }
}
