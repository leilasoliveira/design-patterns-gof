package arquiteturadesw.designpatternsgof.factorymethod.factories;

import arquiteturadesw.designpatternsgof.factorymethod.produtos.biometria.LeitorBiometrico;
import arquiteturadesw.designpatternsgof.factorymethod.produtos.senha.PasswordControl;

public abstract class ColetorDeCredenciaisFactory {
    public abstract LeitorBiometrico createLeitorBiometrico();
    public abstract PasswordControl createPasswordControl();
}
