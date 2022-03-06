package arquiteturadesw.designpatternsgof.factorymethod.factories;

import arquiteturadesw.designpatternsgof.factorymethod.produtos.biometria.FingerPrintReader;
import arquiteturadesw.designpatternsgof.factorymethod.produtos.biometria.LeitorBiometrico;
import arquiteturadesw.designpatternsgof.factorymethod.produtos.senha.PasswordControl;
import arquiteturadesw.designpatternsgof.factorymethod.produtos.senha.PasswordTextBox;

public class ColetorDeCredenciaisFactoryForMobile extends ColetorDeCredenciaisFactory {
    @Override
    public LeitorBiometrico createLeitorBiometrico() {
        return new FingerPrintReader();
    }

    @Override
    public PasswordControl createPasswordControl() {
        return new PasswordTextBox();
    }
}
