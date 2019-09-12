package annotation.serialization.jsonPropertyOrder;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example {
    public static void main(String[] args) throws JsonProcessingException {
        MyBean bean = new MyBean();
        bean.id = 1;
        bean.name = "My Bean";

        String result = new ObjectMapper().writeValueAsString(bean);

        System.out.println(result);
    }
}
