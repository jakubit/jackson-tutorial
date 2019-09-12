package annotation.serialization.jsonGetter;

import com.fasterxml.jackson.annotation.JsonGetter;

class MyBean {
    public int id;
    private String name;

    public MyBean(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @JsonGetter("dupa")
    public String getName() {
        return name;
    }
}
