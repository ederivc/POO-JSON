package Sistema;

import usuarios.Estudiante;
import usuarios.Trabajador;
import usuarios.Usuario;
import usuarios.serializers.UsuarioDeserializer;
import usuarios.serializers.UsuarioSerializer;
import usuarios.utils.Rol;

import java.util.ArrayList;
import java.util.HashMap;

public class Sistema {
    public static final HashMap<Rol, ArrayList<Usuario>> usuarios = new HashMap<>();

    /**
     * Constructor de la clase
     *
     * @param inicializarDatos Valor booleano que indica si se inicializan los datos o no
     */
    public Sistema(boolean inicializarDatos) {
        if (inicializarDatos) {
            inicializarDatos();
        }
    }

    /**
     * Inicialización de datos
     *
     * Crea objetos de tipo trabajador y estudiante y los agrega al HashMap
     */
    private void inicializarDatos() {
        usuarios.put(Rol.trabajadores, new ArrayList<Usuario>());
        usuarios.put(Rol.estudiantes, new ArrayList<Usuario>());

        usuarios.get(Rol.trabajadores).add(new Trabajador("T1", "Alberto", 50, 15000));
        usuarios.get(Rol.trabajadores).add(new Trabajador("T2", "Maria", 30, 8000));
        usuarios.get(Rol.trabajadores).add(new Trabajador("T3", "Farid", 45, 11500));

        usuarios.get(Rol.estudiantes).add(new Estudiante("E1", "Juan", 20, 98.5));
        usuarios.get(Rol.estudiantes).add(new Estudiante("E2", "Pedro", 21, 85.2));
        usuarios.get(Rol.estudiantes).add(new Estudiante("E3", "Susana", 22, 77));
    }

    /**
     * Guardado de datos en JSON
     *
     * Manda a llamar a la clase UsuarioSerializer para serializar los datos a JSON
     */
    public void guardarEnJSON() {
        UsuarioSerializer.serialize();
    }

    /**
     * Lectura de datos en JSON
     *
     * Manda a llamar a la clase UsuarioDeserializer para deserializar los datos del JSON
     */
    public void leerJSON() {
        UsuarioDeserializer.deserialize();
    }
}
