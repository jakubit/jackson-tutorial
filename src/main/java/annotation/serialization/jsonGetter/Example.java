package annotation.serialization.jsonGetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Example {
    public static void main(String[] args) throws JsonProcessingException {
        MyBean myBean = new MyBean(1, "My bean");
        String result = new ObjectMapper().writeValueAsString(myBean);

        System.out.println(result);
    }
}
