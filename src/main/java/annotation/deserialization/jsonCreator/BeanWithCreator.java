package annotation.deserialization.jsonCreator;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class BeanWithCreator {
    private int id;
    private String name;

    public BeanWithCreator() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BeanWithCreator(int id, String name) {
        this.id = id;
        this.name = name;
    }

    /*@JsonCreator
    public BeanWithCreator(
            @JsonProperty("id") int id,
            @JsonProperty("theName") String name) {
        this.id = id;
        this.name = name;
    }*/

    @JsonCreator
    public static BeanWithCreator create(
            @JsonProperty("id") int id,
            @JsonProperty("theName") String name) {
        return new BeanWithCreator(id, name);
    }

    @Override
    public String toString() {
        return "BeanWithCreator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
