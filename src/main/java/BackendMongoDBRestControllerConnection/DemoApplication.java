package BackendMongoDBRestControllerConnection;

import BackendMongoDBRestControllerConnection.style.MongoDBConnection;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication

public class DemoApplication {
	public static void main(String[] args) {
		MongoDBConnection mongoDBConnection = new MongoDBConnection();
		mongoDBConnection.insertData();
	}
}
