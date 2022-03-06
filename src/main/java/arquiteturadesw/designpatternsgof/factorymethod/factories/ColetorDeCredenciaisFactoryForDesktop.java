package arquiteturadesw.designpatternsgof.factorymethod.factories;

import arquiteturadesw.designpatternsgof.factorymethod.produtos.biometria.LeitorBiometrico;
import arquiteturadesw.designpatternsgof.factorymethod.produtos.biometria.ReconhecimentoFacialPorWebCam;
import arquiteturadesw.designpatternsgof.factorymethod.produtos.senha.PasswordControl;
import arquiteturadesw.designpatternsgof.factorymethod.produtos.senha.TecladoVirtual;

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
