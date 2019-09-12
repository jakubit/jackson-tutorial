package annotation.general;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Example {
    public static void main(String[] args) throws JsonProcessingException {
        Item item = new Item(1, "Smartphone", "Dad");
        classExample(item);
        enumExample(item);
    }

    private static void enumExample(Item item) throws JsonProcessingException {
        String result = new ObjectMapper()
                .writerWithView(EnumViews.PUBLIC.getClass())
                .writeValueAsString(item);

        System.out.println(result);
    }

    private static void classExample(Item item) throws JsonProcessingException {
        String result = new ObjectMapper()
                .writerWithView(Views.Public.class)
                .writeValueAsString(item);

        System.out.println(result);
    }
}
