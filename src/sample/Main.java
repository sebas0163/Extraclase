package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
//Para el calculo de la nota final fue la misma para los dos tipos de estudiantes, donde se tomó todas las notas, menos el promedio proyecto y el promedio examenes, quices,tareas
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("interfaz.fxml"));
        primaryStage.setTitle("Estudiante");
        primaryStage.setScene(new Scene(root, 1500, 800));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
