package arquiteturadesw.designpatternsgof.abstractmethod;

import arquiteturadesw.designpatternsgof.abstractmethod.factories.ColetorDeCredenciaisFactory;
import arquiteturadesw.designpatternsgof.abstractmethod.factories.ColetorDeCredenciaisFactoryForDesktop;
import arquiteturadesw.designpatternsgof.abstractmethod.factories.ColetorDeCredenciaisFactoryForMobile;
import arquiteturadesw.designpatternsgof.abstractmethod.produtos.biometria.LeitorBiometrico;
import arquiteturadesw.designpatternsgof.abstractmethod.produtos.senha.PasswordControl;

public class Cliente {

    private PasswordControl passwordControl;
    private LeitorBiometrico leitorBiometrico;

    public Cliente(String plataforma) {
        ColetorDeCredenciaisFactory coletorDeCredenciaisFactory;

        if (plataforma.equals("DESKTOP")) {
            coletorDeCredenciaisFactory = new ColetorDeCredenciaisFactoryForDesktop();
        } else {
            coletorDeCredenciaisFactory = new ColetorDeCredenciaisFactoryForMobile();
        }

        passwordControl = coletorDeCredenciaisFactory.createPasswordControl();
        leitorBiometrico = coletorDeCredenciaisFactory.createLeitorBiometrico();
    }

}
