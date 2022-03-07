package arquiteturadesw.designpatternsgof.facade;

import arquiteturadesw.designpatternsgof.facade.comportamentos.Autenticador;
import arquiteturadesw.designpatternsgof.facade.comportamentos.GestaoDeRisco;
import arquiteturadesw.designpatternsgof.facade.comportamentos.Notificador;
import arquiteturadesw.designpatternsgof.facade.comportamentos.Processador;

public class FacadeForAutorizadorDeCartao {

    public void autorizacaoDeTransacaoEmCartaoDeCredito(boolean executarPreCaptura) {
        GestaoDeRisco gestaoDeRisco = new GestaoDeRisco();
        Notificador notificador = new Notificador();
        Processador processador = new Processador();
        Autenticador autenticador = new Autenticador();

        autenticador.autenticarPontoDeVenda();

        if (executarPreCaptura) {
            processador.registrarPreCaptura();
        }

        gestaoDeRisco.avaliarRiscoDaTransacao();
        processador.validarCHIP();
        processador.confirmarAutorizacaoDaTransacao();
        notificador.notificarTransacao();
    }

}
