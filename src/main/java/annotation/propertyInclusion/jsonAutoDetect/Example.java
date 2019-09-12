package annotation.propertyInclusion.jsonAutoDetect;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example {
    public static void main(String[] args) throws JsonProcessingException {
        PrivateBean bean = new PrivateBean(1, "My private bean");

        String result = new ObjectMapper().writeValueAsString(bean);

        System.out.println(result);
    }
}
