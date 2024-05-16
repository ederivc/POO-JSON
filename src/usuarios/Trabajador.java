package usuarios;

public class Trabajador extends Usuario {
    public double sueldo;

    public Trabajador(String id, String nombre, int edad, double sueldo) {
        super(id, nombre, edad);
        this.sueldo = sueldo;
    }
}
