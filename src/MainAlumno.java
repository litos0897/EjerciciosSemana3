import java.util.Scanner;
public class MainAlumno {
    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Alumno("Jose", 8);
        alumnos[1] = new Alumno("Andrés", 6);
        alumnos[2] = new Alumno("Isabella", 5);
        alumnos[3] = new Alumno("Iván", 9);
        alumnos[4] = new Alumno("Eduardo", 3);


        Jugador[] jugadores=new Jugador[4];
        jugadores[0]=new Jugador("Juan", 100);
        jugadores[1]=new Jugador("Fernando", 200);
        jugadores[2]=new Jugador("Alejandro", 4);
        jugadores[3]=new Jugador("Gonzalo", 50);

        for (int i=0; i< jugadores.length;i++){
            if(jugadores[i].getVida()>0){
                jugadores[i].mostrarDatos();
            }
        }
        System.out.println("\n");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota() > 5) {
                alumnos[i].mostrarDatos();
            }
        }
        double sumaNota = 0;
        for (int i = 0; i < alumnos.length; i++) {
            sumaNota += alumnos[i].getNota();
        }
        double media = sumaNota / alumnos.length;
        System.out.println("La nota media del grupo es: " + media);

        double notaMaxima = alumnos[0].getNota();
        for (int i = 1; i < alumnos.length; i++) {
            if (alumnos[i].getNota() > notaMaxima) {
                notaMaxima = alumnos[i].getNota();
            }
        }
        System.out.println("\nAlumno(s) con la nota más alta: ");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota() == notaMaxima) {
                System.out.println("- " + alumnos[i].getNombre() + " : " + alumnos[i].getNota());
            }
        }
        System.out.println("Introduce un nombre:");
        Scanner sc = new Scanner(System.in);
        String alumnoEntrada = sc.nextLine();

        boolean encontrado=false;

        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNombre().equals(alumnoEntrada)) {
                System.out.println("El alumno tiene una nota de " + alumnos[i].getNota());
                encontrado=true;
                break;
            }
        }
        if (!encontrado){
            System.out.println("No hay ningún alumno con ese nombre");

            }

        }
    }


