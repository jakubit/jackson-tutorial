package annotation.deserialization.jsonCreator;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        String json = "{\"id\":1,\"theName\":\"My bean\"}";

        BeanWithCreator bean = new ObjectMapper().readerFor(BeanWithCreator.class).readValue(json);

        System.out.println(bean.toString());
    }
}
