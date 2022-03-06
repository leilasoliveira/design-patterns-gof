package arquiteturadesw.designpatternsgof.composite;

public abstract class Menu {

    private String texto;

    public abstract void executar();

    public abstract void draw();

    public void add(Menu menu) {}

    public void remove(Menu menu) {}

    public Menu getChild(int menu) {
        return null;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
}
