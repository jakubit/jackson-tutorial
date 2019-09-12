package annotation.serialization.jsonRootName;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "my-user")
public class User {
    public int id;
    public String name;
}
