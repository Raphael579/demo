package BackendMongoDBRestControllerConnection.style;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoSocketException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.List;

public class MongoDBConnection {
    public static List<javax.swing.text.Document> insertData() {
        MongoClient mongoClient = null;
        try {
            MongoClientURI uri = new MongoClientURI("mongodb://localhost:27017");
            mongoClient = new MongoClient(uri);
            MongoDatabase db = mongoClient.getDatabase("MapStyle");
            MongoCollection<Document> collection = db.getCollection("Dark");
            Document data = collection.find().skip(1).first();
            System.out.println(data.toJson());
        } catch (MongoSocketException e) {
            System.out.println("Error: Could not connect to the database. Please check the connection details and try again.");
            System.exit(1);
        } finally {
            if (mongoClient != null) {
                mongoClient.close();
            }
        }
        return null;
    }
}



