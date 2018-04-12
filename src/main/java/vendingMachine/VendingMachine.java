package vendingMachine;

public class VendingMachine {
    private int cokeNum = 5;
    private int dietCokeNum = 5;
    private int teaNum = 5;
    private int hundredYenNum = 10;
    private int changeNum = 0;

    public Viverage vender(int insertMoney, ViverageType viverageType){
        return new Viverage(viverageType);
    }

    public int retrievChange(){
        return 0;
    }

}