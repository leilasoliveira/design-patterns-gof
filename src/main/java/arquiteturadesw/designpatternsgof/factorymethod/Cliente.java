package arquiteturadesw.designpatternsgof.factorymethod;

import arquiteturadesw.designpatternsgof.factorymethod.factories.ColetorDeCredenciaisFactory;
import arquiteturadesw.designpatternsgof.factorymethod.produtos.biometria.LeitorBiometrico;
import arquiteturadesw.designpatternsgof.factorymethod.produtos.senha.PasswordControl;

public abstract class Cliente {

    private PasswordControl passwordControl;
    private LeitorBiometrico leitorBiometrico;
    protected abstract ColetorDeCredenciaisFactory buildColetorDeCredenciais();

    public Cliente() {
        ColetorDeCredenciaisFactory coletorDeCredenciaisFactory = buildColetorDeCredenciais();

        passwordControl = coletorDeCredenciaisFactory.createPasswordControl();
        leitorBiometrico = coletorDeCredenciaisFactory.createLeitorBiometrico();
    }

}
