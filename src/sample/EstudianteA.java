package sample;

/**
 * Clase que alamcena los datos de los estudiantes de tipo A
 * @author Sebastián Moya
 */
//ejemplo del concepto de herencia y Clase
public class EstudianteA extends Estudiantes {

    /**
     * Método constructor
     * @param carne
     * @param nombre
     * @param correo
     * @param telefono
     * @param tipo
     * @param nickname
     * @param promedio_exam
     * @param promedio_quices
     * @param promedio_tareas
     * @param proyecto1
     * @param proyecto2
     * @param proyecto3
     */
    public EstudianteA(int carne, String nombre, String correo, int telefono, String tipo, String nickname, double promedio_exam, double promedio_quices, double promedio_tareas, double proyecto1, double proyecto2, double proyecto3) {
        super(carne, nombre, correo, telefono, tipo, nickname, promedio_exam, promedio_quices, promedio_tareas, proyecto1, proyecto2, proyecto3);
    }

    /**
     * Método que calcula el promedio de los Examenes, tareas y quices
     */
    //Ejemplo de sobreescritura
    @Override
    public void calcularPromedios() {
        promedio_Examenes = (Promedio_exam +Promedio_quices + Promedio_tareas)/ 3;

    }


}
