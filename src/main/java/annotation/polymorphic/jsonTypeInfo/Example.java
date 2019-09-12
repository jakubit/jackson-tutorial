package annotation.polymorphic.jsonTypeInfo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example {
    public static void main(String[] args) throws JsonProcessingException {
        Zoo.Dog dog = new Zoo.Dog("Pestka", 123.1d);
        Zoo zoo = new Zoo(dog);

        String result = new ObjectMapper().writeValueAsString(zoo);

        System.out.println(result);
    }
}
