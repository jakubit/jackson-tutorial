package annotation.serialization.jsonSerialize;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.time.LocalDate;

public class Example {
    public static void main(String[] args) throws JsonProcessingException {
        Event event = new Event();
        event.eventDate = LocalDate.now();
        event.name = "iPhone 11 Pro premiere";

        String result = new ObjectMapper().writeValueAsString(event);

        System.out.println(result);
    }
}
