package arquiteturadesw.designpatternsgof.factorymethod;

import arquiteturadesw.designpatternsgof.factorymethod.factories.ColetorDeCredenciaisFactory;
import arquiteturadesw.designpatternsgof.factorymethod.factories.ColetorDeCredenciaisFactoryForMobile;

public class MobileCliente extends Cliente {

    @Override
    protected ColetorDeCredenciaisFactory buildColetorDeCredenciais() {
        return new ColetorDeCredenciaisFactoryForMobile();
    }
}
