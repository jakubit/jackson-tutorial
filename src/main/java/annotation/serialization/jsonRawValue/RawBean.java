package annotation.serialization.jsonRawValue;

import com.fasterxml.jackson.annotation.JsonRawValue;

class RawBean {
    public String name;
    @JsonRawValue
    public String json;
}
