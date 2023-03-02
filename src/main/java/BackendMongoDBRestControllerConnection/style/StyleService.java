package BackendMongoDBRestControllerConnection.style;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.swing.text.Document;
import java.util.List;

@RestController
class ExampleController {

    @Autowired
    private ExampleController exampleService;

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/examples")
    @ResponseBody
    public List<Document> getExamples() {
        return MongoDBConnection.insertData();
    }
}