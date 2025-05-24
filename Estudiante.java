public class Estudiante {

    private String cc;
    private String carrera;
    private String nombre;
    private int edad;
    private char genero;
    private float peso;


    public Estudiante(String cc, String carrera, String nombre, int edad, char genero, float peso) {
        this.cc = cc;
        this.carrera = carrera;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
    }


    public static Estudiante createEstudiante(String cc, String carrera, String nombre, int edad, char genero, float peso) {
        return new Estudiante(cc, carrera, nombre, edad, genero, peso);
    }




    @Override
    public String toString() {
        return "Estudiante{" +
                "cc='" + cc + '\'' +
                ", carrera='" + carrera + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", peso=" + peso +
                '}';
    }
}
