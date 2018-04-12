package vendingMachine;

public class VendingMachine {
    private Stocks stocks;
    private int hundredYenNum = 10;
    private int changeNum = 0;

    VendingMachine() {
        this.stocks = new Stocks();
    }

    public Viverage vender(int insertMoney, ViverageType viverageType) {
        return new Viverage(viverageType);
    }

    public int retrievChange(){
        return 0;
    }

}