package arquiteturadesw.designpatternsgof.templatemethod.services;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public abstract class UpdateBalanceService {

    public void updateBalance() {
        List<Long> investors = getInvestorsList();
        Map<Long, BigDecimal> mapInvestorsAndBalance = getBalance(investors);
        saveBalance(mapInvestorsAndBalance);
    }

    protected abstract List<Long> getInvestorsList();

    protected abstract Map<Long, BigDecimal> getBalance(List<Long> investors);

    protected abstract void saveBalance(Map<Long, BigDecimal> mapInvestorsAndBalance);
}
