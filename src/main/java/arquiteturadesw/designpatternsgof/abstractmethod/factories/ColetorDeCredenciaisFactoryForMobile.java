package arquiteturadesw.designpatternsgof.abstractmethod.factories;

import arquiteturadesw.designpatternsgof.abstractmethod.produtos.biometria.FingerPrintReader;
import arquiteturadesw.designpatternsgof.abstractmethod.produtos.biometria.LeitorBiometrico;
import arquiteturadesw.designpatternsgof.abstractmethod.produtos.senha.PasswordControl;
import arquiteturadesw.designpatternsgof.abstractmethod.produtos.senha.PasswordTextBox;

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
