package usuarios;

public class Estudiante extends Usuario {
    public double promedio;

    public Estudiante(String id, String nombre, int edad, double promedio) {
        super(id, nombre, edad);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }
}
