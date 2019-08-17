package sample;
import java.io.*;
import java.util.*;

import static sample.Controller.archivo;

/**
 * Clase leercvs se usa para cargar un archivo csv y con los valores tomados de esta, crea objetos de tipo EstudianteA o EstudianteB respectivamente.
 * @author Sebastián Moya
 */
//Ejemplo de clase
public class Leercvs {
    private String csv = archivo;

    /**
     * Método que actualiza el atributo csv
     * @param archivo contiene la ruta
     */
    public void setCsv(String archivo){
        this.csv = archivo;

    }

    static ArrayList<Estudiantes> lista = new ArrayList<Estudiantes>();

    /**
     * Metodo que lee el archivo y crea las respectivas clases con los datos que toma
     *
     */
    public void leerArchivo(){
        System.out.println(csv);
        try {
            FileReader doc = new FileReader(csv);
            BufferedReader br = new BufferedReader(doc);
            boolean r = true;
            int contador = 0;
            while (r){
                String text = br.readLine();
                if(text != null){
                    if(contador >0){
                        String datos [];
                        datos = text.split(";");
                        int carne = Integer.parseInt(datos[0]);
                        String nombre = datos[1];
                        String correo = datos[2];
                        int telefono = Integer.parseInt(datos[3]);
                        String nickname = datos[4];
                        String tipo = datos[5];
                        double notaExam= Double.parseDouble(datos[6]);
                        double notaQuiz = Double.parseDouble(datos[7]);
                        double notaTareas = Double.parseDouble(datos[8]);
                        double proyecto1 = Double.parseDouble(datos[9]);
                        double proyecto2 = Double.parseDouble(datos[10]);
                        double proyecto3 = Double.parseDouble(datos[11]);
                        switch (tipo){
                            //Ejemplo de polimorfismo, esto ya que en una lista de Estudiantes se puede instanciar un objeto tipo Estudiante A
                            case "A": lista.add(new EstudianteA(carne,nombre,correo,telefono,tipo,nickname,notaExam,notaQuiz,notaTareas,proyecto1,proyecto2,proyecto3));
                            break;
                            case "B": lista.add(new EstudianteB(carne,nombre,correo,telefono,tipo,nickname,notaExam,notaQuiz,notaTareas,proyecto1,proyecto2,proyecto3));
                            break;
                        }
                    }
                    else{
                        contador ++;
                    }
                }
                else{
                    r = false;
                }

            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }

    /**
     * Método que borra los elementos en la lista
     */
    public void reset(){
        lista.clear();
    }

}
