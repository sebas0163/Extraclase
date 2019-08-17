package sample;

/**
 * Clase que se encarga de guardar todos los datos recolectados del archivo csv y tambien guarda metodos para retonar dicha información y obtener varios promedios
 * @author Sebastián Moya
 */

public abstract class Estudiantes {
    //Ejemplo de encapsulación y Atributos
    protected int Carne;
    protected String Nombre;
    protected String Correo;
    protected int Telefono;
    protected String Tipo;
    protected String nickname;
    protected double Promedio_exam;
    protected double Promedio_quices;
    protected double Promedio_tareas;
    protected double Proyecto1;
    protected double Proyecto2;
    protected double Proyecto3;
    protected double notaFinal;
    protected double promedio_Examenes ;
    protected double promedioProyectos ;

    /**
     * Metetodo constructor
     * @param carne int numero de carne del estudiante
     * @param nombre String Nombre completo del estudiante con sus apellidos
     * @param correo String Correo electrónico del estudiante
     * @param telefono int Teléfono del estudiante
     * @param tipo String Tipo de esstudiante, si es A o B
     * @param nickname String Apodo del estudiante
     * @param promedio_exam Double Promedio de los examanes
     * @param promedio_quices Double Promedio de los quices
     * @param promedio_tareas Double Promedio de las Tareas
     * @param proyecto1 Double nota del proyecto #1
     * @param proyecto2 Double nota del proyecto #2
     * @param proyecto3 Double nota del proyecto #3
     */
    public Estudiantes(int carne, String nombre, String correo, int telefono, String tipo, String nickname, double promedio_exam, double promedio_quices, double promedio_tareas, double proyecto1, double proyecto2, double proyecto3) {
        this.Carne = carne;
        this.Nombre = nombre;
        this.Correo = correo;
        this.Telefono = telefono;
        this.Tipo = tipo;
        this.nickname = nickname;
        this.Promedio_exam = promedio_exam;
        this.Promedio_quices = promedio_quices;
        this.Promedio_tareas = promedio_tareas;
        this.Proyecto1 = proyecto1;
        this.Proyecto2 = proyecto2;
        this.Proyecto3 = proyecto3;
    }
    //Ejemplo de Abstracción
    public abstract void calcularPromedios();

    //Ejemplo de metodos

    /**
     * Método que calcula la nota final tomando los valores de los atributos proyecto 1,2,3 más los promedios
     */
    public void calcular_Notafinal(){
        notaFinal = (Promedio_exam+Promedio_quices+Promedio_tareas+Proyecto1+Proyecto2+Proyecto3)/6;
    }

    /**
     * Método que obtiene el carne del estudiante
     * @return el valor del atributo carne
     */
    public int getCarne() {
        return Carne;
    }

    /**
     * Método que obtiene el nombre del estudiante
     * @return valor del atributo Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * Método que obtiene el correo del estudiante
     * @return valor del atributo Correo
     */
    public String getCorreo() {
        return Correo;
    }

    /**
     * Método que obtiene el telefono del estudiante
     * @return valor del atributo Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    public String getTipo() {
        return Tipo;
    }

    /**
     * Método que obtiene el apodo del estudiante
     * @return valor del atributo Nickname
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * Método que obtiene el promedio de los examenes del estudiante
     * @return valor del atributo Promedio_exam
     */
    public double getPromedio_exam() {
        return Promedio_exam;
    }

    /**
     * Método que obtiene el promedio de los quices del estudiante
     * @return valor del atributo Promedio_quices
     */
    public double getPromedio_quices() {
        return Promedio_quices;
    }

    /**
     * Método que obtiene el promedio de las tareas del estudiante
     * @return valor del atributo Correo
     */
    public double getPromedio_tareas() {
        return Promedio_tareas;
    }

    /**
     * Método que obtiene la nota del proyecto #1
     * @return valor del atributo Proyecto1
     */
    public double getProyecto1() {
        return Proyecto1;
    }
    /**
     * Método que obtiene la nots del proyecto#2
     * @return valor del atributo Proyecto2
     */
    public double getProyecto2() {
        return Proyecto2;
    }

    /**
     * Método que obtiene la nota del proyecto#3
     * @return valor del atributo Proyecto3
     */
    public double getProyecto3() {
        return Proyecto3;
    }

    /**
     * Método que obtiene la nota final del estudiante
     * @return valor del atributo notaFinal
     */
    public double getNotaFinal() { return notaFinal; }

    /**
     * Método que obtiene el valor del  promedio de los exámenes, los quices y las tareas
     * @return valor del atributo promedio_Examenes
     */
    public double getPromedio_Examenes() {
        return promedio_Examenes;
    }

    /**
     * Método que obtiene el promedio de las notas de los proyectos
     * @return valor del atributo promedioProyectos
     */
    public double getPromedioProyectos() {
        return promedioProyectos;
    }
}
