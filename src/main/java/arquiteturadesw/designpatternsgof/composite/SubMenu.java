package arquiteturadesw.designpatternsgof.composite;

import java.util.ArrayList;
import java.util.List;

// Classe Composição
public class SubMenu extends Menu {
    private List<Menu> subMenus = new ArrayList<>();

    @Override
    public void executar() {

    }

    @Override
    public void draw() {

    }

    @Override
    public void add(Menu menu) {

    }

    @Override
    public void remove(Menu menu) {

    }

    @Override
    public Menu getChild(int menu) {
        return null;
    }
}
