package annotation.serialization.jsonValue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example {
    public static void main(String[] args) throws JsonProcessingException {
        String enumAsString = new ObjectMapper().writeValueAsString(TypeEnumWithValue.TYPE_1);

        System.out.println(enumAsString);
    }
}
