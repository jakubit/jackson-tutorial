package annotation.serialization.jsonAnyGetter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

class Example {
    public static void main(String[] args) throws JsonProcessingException {
        ExtendableBean bean = new ExtendableBean("MyBean");
        bean.add("attr1", "val1");
        bean.add("attr2", "val2");

        String result = new ObjectMapper().writeValueAsString(bean);

        System.out.println(result);
    }
}
