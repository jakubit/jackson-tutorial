package annotation.serialization.jsonSerialize;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.time.LocalDate;

public class Event {
    public String name;

    @JsonSerialize(using = CustomLocalDateSerializer.class)
    public LocalDate eventDate;
}
