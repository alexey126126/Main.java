package jsonReader;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import playerStructure.Player;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class ParsingJson {
    public static List<Player> parsing(String fileName) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        TypeReference<List<Player>> typeReference = new TypeReference<List<Player>>() {};
        File file = new File(fileName);
        InputStream inputStream = new FileInputStream(file);
        return  objectMapper.readValue(inputStream,typeReference);

    }
}
