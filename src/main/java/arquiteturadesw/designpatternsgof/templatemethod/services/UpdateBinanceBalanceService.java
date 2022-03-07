package arquiteturadesw.designpatternsgof.templatemethod.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class UpdateBinanceBalanceService extends UpdateBalanceService {
    @Override
    protected List<Long> getInvestorsList() {
        System.out.println("Getting Binance investor list");
        return null;
    }

    @Override
    protected Map<Long, BigDecimal> getBalance(List<Long> investors) {
        System.out.println("Getting Binance balance");
        return null;
    }

    @Override
    protected void saveBalance(Map<Long, BigDecimal> mapInvestorsAndBalance) {
        System.out.println("Saving Binance balance");
    }
}
