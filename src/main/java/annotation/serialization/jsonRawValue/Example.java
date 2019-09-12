package annotation.serialization.jsonRawValue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example {
    public static void main(String[] args) throws JsonProcessingException {
        RawBean bean = new RawBean();
        bean.name = "My bean";
        bean.json = "{\"attr\":false}";

        String result = new ObjectMapper().writeValueAsString(bean);

        System.out.println(result);
    }
}
