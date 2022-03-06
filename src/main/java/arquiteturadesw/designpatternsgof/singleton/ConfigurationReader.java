package arquiteturadesw.designpatternsgof.singleton;

public class ConfigurationReader {

    private static ConfigurationReader instance;
    //private static object _lock = new object();

    private ConfigurationReader() {}

    public ConfigurationReader getInstance() {
        if (instance == null) {
            // no código c#, existe o lock que impede que outra classe tente criar uma instância desta antes de finalizar este método
            // isso é importante em cenários onde existe grande concorrência de acessos
            // em c#, seria o código comentado abaixo, com o atributo desta classe comentado:
            // lock (_lock) {
            // if (instance == null) {
            instance = new ConfigurationReader();
            // }
            // }
        }
        return instance;
    }

}
