/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplomvcjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author Javier
 */
public class VistaPrincipal extends Application {
    
    private Label label = new Label("0");        
    
    @Override
    public void start(Stage primaryStage) {
        // Se le pasa el label al controlador para que pueda
        //  mostrar información en él cuando lo necesite
        Controlador.setLabel(label);
        
        Button btn = new Button("Contar");
        btn.setOnAction(new EventHandler<ActionEvent>() {            
            @Override
            public void handle(ActionEvent event) {
                // El controlador se encargará de gestionar el contador
                //  y mostrar en pantalla el nuevo valor
                Controlador.incrementarContador();                
            }
        });        
        
        VBox root = new VBox();
        root.getChildren().add(btn);
        root.getChildren().add(label);
        
        Scene scene = new Scene(root, 300, 250);        
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
