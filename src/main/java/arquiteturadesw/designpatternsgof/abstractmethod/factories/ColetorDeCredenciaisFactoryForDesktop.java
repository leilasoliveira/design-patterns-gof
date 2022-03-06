package arquiteturadesw.designpatternsgof.abstractmethod.factories;

import arquiteturadesw.designpatternsgof.abstractmethod.produtos.biometria.LeitorBiometrico;
import arquiteturadesw.designpatternsgof.abstractmethod.produtos.biometria.ReconhecimentoFacialPorWebCam;
import arquiteturadesw.designpatternsgof.abstractmethod.produtos.senha.PasswordControl;
import arquiteturadesw.designpatternsgof.abstractmethod.produtos.senha.TecladoVirtual;

public class ColetorDeCredenciaisFactoryForDesktop extends ColetorDeCredenciaisFactory
{
    @Override
    public LeitorBiometrico createLeitorBiometrico() {
        return new ReconhecimentoFacialPorWebCam();
    }

    @Override
    public PasswordControl createPasswordControl() {
        return new TecladoVirtual();
    }
}
