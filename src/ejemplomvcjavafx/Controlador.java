package ejemplomvcjavafx;
import javafx.scene.control.Label;

public class Controlador {

    private static ModeloContador modeloContador = new ModeloContador();
    private static Label label;
    
    // Todos los métodos de esta clase se han hecho static
    //  como ejemplo de uso de elementos static
    
    public static void setLabel(Label label) {
        Controlador.label = label;
    }
    
    public static void incrementarContador() {
        modeloContador.incrementarContador();
        int contador = modeloContador.getContador();
        label.setText(String.valueOf(contador));
    }
    
}
