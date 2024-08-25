package Modelo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;



public class Conexion {
    private static MongoDatabase baseDatos;
    private static MongoClient mongoClient;

    // Bloque estático para establecer la conexión
    static {
        try {
            String password = "Gabo123";
            String clusterUrl = "cluster0.yybv8.mongodb.net";
            String databaseName = "MediCare";
            
            // Crear la URI de conexión
            MongoClientURI uri = new MongoClientURI("mongodb+srv://gamurigm:" + password + "@" + clusterUrl + "/" + databaseName);
            
            mongoClient = new MongoClient(uri);
            baseDatos = mongoClient.getDatabase(databaseName);
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.err.println("Error al establecer la conexión: " + e.getMessage());
            e.printStackTrace();
        }
    }

    // Constructor privado para evitar instanciación
    private Conexion() {}

    public static MongoClient getMongoClient() {
        return mongoClient;
    }

    public static MongoDatabase getBaseDatos() {
        return baseDatos;
    }

    public static MongoCollection<Document> getColeccion(String nombreColeccion) {
        return baseDatos.getCollection(nombreColeccion);
    }

    public static void close() {
        if (mongoClient != null) {
            mongoClient.close();
            System.out.println("Conexión cerrada");
        }
    }
}