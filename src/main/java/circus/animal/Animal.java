package circus.animal;

import circus.Asset;

public abstract class Animal implements Asset {
    //Cannot create Animal class
    public abstract String speak(); //No method body

    public int getValue() {
        return 10;
    }
}
