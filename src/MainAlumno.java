public class MainAlumno {
    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[5];

        alumnos[0] = new Alumno("Jose", 8);
        alumnos[1] = new Alumno("Andrés", 6);
        alumnos[2] = new Alumno("Isabella", 5);
        alumnos[3] = new Alumno("Iván", 9);
        alumnos[4] = new Alumno("Eduardo", 3);

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
        System.out.println("\n Alumno(s) con la nota más alta: ");
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i].getNota() == notaMaxima) {
                System.out.println("- " + alumnos[i].getNombre()+" : "+alumnos[i].getNota());
            }
        }
    }
}

