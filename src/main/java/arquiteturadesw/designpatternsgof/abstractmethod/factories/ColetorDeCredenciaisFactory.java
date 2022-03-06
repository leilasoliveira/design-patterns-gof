package arquiteturadesw.designpatternsgof.abstractmethod.factories;

import arquiteturadesw.designpatternsgof.abstractmethod.produtos.biometria.LeitorBiometrico;
import arquiteturadesw.designpatternsgof.abstractmethod.produtos.senha.PasswordControl;

public abstract class ColetorDeCredenciaisFactory {
    public abstract LeitorBiometrico createLeitorBiometrico();
    public abstract PasswordControl createPasswordControl();
}
