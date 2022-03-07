package arquiteturadesw.designpatternsgof.templatemethod;

import arquiteturadesw.designpatternsgof.templatemethod.services.UpdateBinanceBalanceService;
import arquiteturadesw.designpatternsgof.templatemethod.services.UpdateCoinextBalanceService;

public class TestTemplateMethod {

    public static void main(String[] args) {
        UpdateBinanceBalanceService binanceBalanceService = new UpdateBinanceBalanceService();
        UpdateCoinextBalanceService coinextBalanceService = new UpdateCoinextBalanceService();

        binanceBalanceService.updateBalance();
        coinextBalanceService.updateBalance();
    }
}
