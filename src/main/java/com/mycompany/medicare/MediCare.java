package com.mycompany.medicare;

import Modelo.Conexion;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class MediCare {

    public static void main(String[] args) {
         try {
            MongoDatabase database = Conexion.getBaseDatos();
            
            MongoCollection<Document> collection = database.getCollection("Pacientes");
            Document doc = new Document("nombre", "Juan")
                                    .append("apellido", "Pérez")
                                    .append("edad", 30);

            collection.insertOne(doc);
            
            System.out.println("Documento insertado con éxito.");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al conectar a MongoDB.");
        } finally {
            // Cerrar la conexión
            Conexion.close();
        }
    }
}
