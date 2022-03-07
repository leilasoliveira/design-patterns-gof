package arquiteturadesw.designpatternsgof.decorator;

import java.util.ArrayList;
import java.util.List;

public class JobDispatcher {

    public void runOnSchedule() {
        List<Job> jobs = getJobsToRun();
        for (Job job : jobs) {
            job.execute();
        }
    }

    protected List<Job> getJobsToRun() {
        List<Job> result = new ArrayList<>();

        // Comportamentos vindo de um XML de configuração ou banco de dados por exemplo.

        GerarRelatorioDeVendasJob jobGerarRelatorioDeVendas = new GerarRelatorioDeVendasJob();
        JobWithEmailAlert decoratorGerarRelatorioDeVendas = new JobWithEmailAlert(jobGerarRelatorioDeVendas);
        result.add(decoratorGerarRelatorioDeVendas);

        ExecutarConciliacaoDeBoletosJob jobConciliacao = new ExecutarConciliacaoDeBoletosJob();
        JobWithEmailAlert decoratorTransacaoDaConciliacao = new JobWithEmailAlert(jobConciliacao);
        JobWithLogging decoratorLogging = new JobWithLogging(decoratorTransacaoDaConciliacao);
        result.add(decoratorLogging);

        return result;
    }
}
