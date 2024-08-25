package Modelo;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

import static com.mongodb.client.model.Filters.eq;

public class PacienteDAO {

    private final MongoDatabase database;
    private final MongoCollection<Document> coleccion;

    public PacienteDAO() {
        // Obtener la base de datos y la colección desde la clase Conexion
        this.database = Conexion.getBaseDatos();
        this.coleccion = database.getCollection("Pacientes");
    }

    public void crearPaciente(Paciente paciente) {
        Document doc = new Document("cedula", paciente.getCedula())
                .append("nombre", paciente.getNombre())
                .append("apellido", paciente.getApellido())
                .append("genero", paciente.getGenero())
                .append("direccion", paciente.getDireccion())
                .append("telefono", paciente.getTelefono())
                .append("correo", paciente.getCorreo());

        coleccion.insertOne(doc);
        System.out.println("Paciente insertado con éxito");
    }

    public List<Paciente> obtenerTodosLosPacientes() {
        List<Paciente> pacientes = new ArrayList<>();
        MongoCursor<Document> cursor = coleccion.find().iterator();

        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                Paciente paciente = new Paciente(
                        doc.getString("cedula"),
                        doc.getString("nombre"),
                        doc.getString("apellido"),
                        doc.getString("genero"),
                        doc.getString("direccion"),
                        doc.getString("telefono"),
                        doc.getString("correo")
                );
                pacientes.add(paciente);
            }
        } finally {
            cursor.close();
        }
        return pacientes;
    }

    // Método para encontrar un paciente por su cédula
    public Paciente obtenerPacientePorCedula(String cedula) {
        Document doc = coleccion.find(eq("cedula", cedula)).first();
        if (doc != null) {
            return new Paciente(
                    doc.getString("cedula"),
                    doc.getString("nombre"),
                    doc.getString("apellido"),
                    doc.getString("genero"),
                    doc.getString("direccion"),
                    doc.getString("telefono"),
                    doc.getString("correo")
            );
        } else {
            return null;
        }
    }

    // Método para actualizar los datos de un paciente
    public void actualizarPaciente(Paciente paciente) {
        Document doc = new Document("cedula", paciente.getCedula())
                .append("nombre", paciente.getNombre())
                .append("apellido", paciente.getApellido())
                .append("genero", paciente.getGenero())
                .append("direccion", paciente.getDireccion())
                .append("telefono", paciente.getTelefono())
                .append("correo", paciente.getCorreo());

        coleccion.updateOne(eq("cedula", paciente.getCedula()), new Document("$set", doc));
        System.out.println("Paciente actualizado con éxito");
    }

    // Método para eliminar un paciente por su cédula
    public void eliminarPaciente(String cedula) {
        coleccion.deleteOne(eq("cedula", cedula));
        System.out.println("Paciente eliminado con éxito");
    }
}
