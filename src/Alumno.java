public class Alumno {
    private String nombre;
    private double nota;

    public Alumno(String nombre, double nota){
        this.nombre=nombre;
        this.nota=nota;
    }
    public double getNota(){
        return nota;
    }
    public String getNombre(){
        return nombre;
    }
    public void mostrarDatos(){
        System.out.println("Alumno: " + nombre + " | Nota: " + nota);
    }
}
