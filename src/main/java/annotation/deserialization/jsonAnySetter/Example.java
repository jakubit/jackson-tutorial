package annotation.deserialization.jsonAnySetter;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Example {
    public static void main(String[] args) throws IOException {
        String json = "{\"name\":\"My bean\",\"naem\":\"elo\",\"attr2\":\"val2\",\"attr1\":\"val1\"}";

        ExtendableBean bean = new ObjectMapper()
                .readerFor(ExtendableBean.class)
                .readValue(json);

        System.out.println(bean.toString());
    }
}
