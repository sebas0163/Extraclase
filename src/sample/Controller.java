package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import java.io.File;


import static sample.Leercvs.lista;

/**
 * Clase que se encarga de maneja la interfaz de javafx
 * @author Sebastián Moya
 */

public class Controller {
    Leercvs l = new Leercvs();
    public static String archivo = "C:\\Users\\sebas\\Desktop\\Aplicaci-n-estudiantes\\ExtraClase\\src\\sample\\1.csv";
    @FXML private Button Boton;
    @FXML
    private TableView<Estudiantes> tablaEstudiante;
    @FXML private TableColumn<Estudiantes,Integer> carne_cl;
    @FXML private TableColumn<Estudiantes,String> nombrecl;
    @FXML private TableColumn<Estudiantes,String> correocl;
    @FXML private TableColumn<Estudiantes,Integer> telefonocl;
    @FXML private TableColumn<Estudiantes,String> nickcl;
    @FXML private TableColumn<Estudiantes,String> tipocl;
    @FXML private TableColumn<Estudiantes,Double> prom_examcl;
    @FXML private TableColumn<Estudiantes,Double> prom_quizcl;
    @FXML private TableColumn<Estudiantes,Double> prom_tareascl;
    @FXML private TableColumn<Estudiantes,Double> proyec_cl;
    @FXML private TableColumn<Estudiantes,Double> proyec2_cl;
    @FXML private TableColumn<Estudiantes,Double> proyec3_cl;
    @FXML private TableColumn<Estudiantes,Double> prom_all;
    @FXML private TableColumn<Estudiantes,Double> prom_proyec;
    @FXML private TableColumn<Estudiantes,Double> notaFinal_cl;

    /**
     * Método que abre un explorador de archivos y permite seleccionar la ruta del archivo por abrir
     */
    public void Accion_Boton(){
        FileChooser fc = new FileChooser();
        fc.getExtensionFilters().addAll(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File selectedFile = fc.showOpenDialog(null);
        archivo = selectedFile.getAbsolutePath();
        l.reset();
        l.setCsv(archivo);
        initialize();
    }

    /**
     * Método que inicializa la ejecución de la interfaz y agrega los datos a la tabla
     */
    public void initialize(){
        //Ejemplo de instancias
        l.leerArchivo();
        for(Estudiantes est: lista){
            if(est.getTipo() == "A"){
                est.calcularPromedios();
            }else{
                est.calcularPromedios();
            }

            est.calcular_Notafinal();
        }
        ObservableList<Estudiantes> lista_Observable = FXCollections.observableArrayList(lista);

        carne_cl.setCellValueFactory(new PropertyValueFactory<Estudiantes,Integer>("Carne"));
        nombrecl.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>("Nombre"));
        correocl.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>("Correo"));
        telefonocl.setCellValueFactory(new PropertyValueFactory<Estudiantes,Integer>("Telefono"));
        nickcl.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>("nickname"));
        tipocl.setCellValueFactory(new PropertyValueFactory<Estudiantes,String>("Tipo"));
        prom_examcl.setCellValueFactory(new PropertyValueFactory<Estudiantes,Double>("Promedio_exam"));
        prom_quizcl.setCellValueFactory(new PropertyValueFactory<Estudiantes, Double>("Promedio_quices"));
        prom_tareascl.setCellValueFactory(new PropertyValueFactory<Estudiantes,Double>("Promedio_tareas"));
        proyec_cl.setCellValueFactory(new PropertyValueFactory<Estudiantes, Double>("Proyecto1"));
        proyec2_cl.setCellValueFactory(new PropertyValueFactory<Estudiantes, Double>("Proyecto2"));
        proyec3_cl.setCellValueFactory(new PropertyValueFactory<Estudiantes, Double>("Proyecto3"));
        prom_all.setCellValueFactory(new PropertyValueFactory<Estudiantes,Double>("promedio_Examenes"));
        prom_proyec.setCellValueFactory(new PropertyValueFactory<Estudiantes,Double>("promedioProyectos"));
        notaFinal_cl.setCellValueFactory(new PropertyValueFactory<Estudiantes,Double>("notaFinal"));

        tablaEstudiante.setItems(lista_Observable);

    }



}