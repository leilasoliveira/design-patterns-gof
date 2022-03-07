package arquiteturadesw.designpatternsgof.templatemethod.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class UpdateCoinextBalanceService extends UpdateBalanceService {
    @Override
    protected List<Long> getInvestorsList() {
        System.out.println("Getting Coinext investor list");
        return null;
    }

    @Override
    protected Map<Long, BigDecimal> getBalance(List<Long> investors) {
        System.out.println("Getting Coinext balance");
        return null;
    }

    @Override
    protected void saveBalance(Map<Long, BigDecimal> mapInvestorsAndBalance) {
        System.out.println("Saving Coinext balance");
    }
}
