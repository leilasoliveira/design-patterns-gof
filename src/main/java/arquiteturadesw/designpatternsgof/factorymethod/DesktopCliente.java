package arquiteturadesw.designpatternsgof.factorymethod;

import arquiteturadesw.designpatternsgof.factorymethod.factories.ColetorDeCredenciaisFactory;
import arquiteturadesw.designpatternsgof.factorymethod.factories.ColetorDeCredenciaisFactoryForDesktop;

public class DesktopCliente extends Cliente {

    @Override
    protected ColetorDeCredenciaisFactory buildColetorDeCredenciais() {
        return new ColetorDeCredenciaisFactoryForDesktop();
    }
}
