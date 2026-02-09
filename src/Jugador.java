public class Jugador {
    private String nombre;
    private int vida;

    public Jugador(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
    }

    public int getVida() {
        return vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void recibirDanio (int cantidad) {
        this.vida = vida - cantidad;
        if (this.vida < 0) {
            this.vida = 0;
        }
    }

    public void mostrarDatos() {
        System.out.println("Jugador: " + nombre + " | Vida: " + vida);
    }
}
