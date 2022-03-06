package arquiteturadesw.designpatternsgof.composite;

import javax.swing.*;

// Classe Folha
public class ItemDeMenu extends Menu {
    private Icon icone;

    @Override
    public void executar() {

    }

    @Override
    public void draw() {

    }

    public Icon getIcone() {
        return icone;
    }

    public void setIcone(Icon icone) {
        this.icone = icone;
    }
}
