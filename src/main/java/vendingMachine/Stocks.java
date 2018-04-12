package vendingMachine;

import lombok.Getter;

public class Stocks {

    @Getter
    private int cokeNum = 5;
    private int dietCokeNum = 5;
    private int teaNum = 5;

    public void reduce(ViverageType viverageType) {
        switch (viverageType) {
            case Coke:
                cokeNum--;
                break;
            case DietCoke:
                dietCokeNum--;
                break;
            case Tea:
                teaNum--;
                break;
        }
    }
}