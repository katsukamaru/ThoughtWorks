package vendingMachine;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendingMachineTest {

    @Test
    public void vendingMachineTest(){
        VendingMachine vm = new VendingMachine();
        Viverage bought = vm.vender(100, ViverageType.Coke);
        assertEquals(ViverageType.Coke, bought.getViverageType());
    }

    @Test
    public void reduceFromStocks() {
        Stocks stocks = new Stocks();
        stocks.reduce(ViverageType.Coke);
        assertEquals(4, stocks.getCokeNum());
    }

}