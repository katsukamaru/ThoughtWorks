package vendingMachine;

public class Viverage {
    private int cokeNum = 1;
    private int dietCokeNum = 2;
    private int teaNum = 3;
    private int viverageType;

    Viverage(int viverageType) {
        this.viverageType = viverageType;
    }

    public int getViverageType(){
        return this.viverageType;
    }
}
