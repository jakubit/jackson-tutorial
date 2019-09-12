package annotation.serialization.jsonPropertyOrder;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"name", "id"})
public class MyBean {
    public int id;
    public String name;
}
