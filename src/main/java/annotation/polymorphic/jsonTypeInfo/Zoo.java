package annotation.polymorphic.jsonTypeInfo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

import static com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY;

public class Zoo {
    public Animal animal;

    public Zoo(Animal animal) {
        this.animal = animal;
    }

    @JsonTypeInfo(
            use = JsonTypeInfo.Id.NAME,
            include = PROPERTY,
            property = "type")
    @JsonSubTypes({
            @JsonSubTypes.Type(value = Dog.class, name = "dog"),
            @JsonSubTypes.Type(value = Cat.class, name = "cat")
    })
    public static class Animal {
        public String name;

        public Animal(String name) {
            this.name = name;
        }
    }

    @JsonTypeName("doge")
    public static class Dog extends Animal {
        public double barkVolume;

        public Dog(String name, double barkVolume) {
            super(name);
            this.barkVolume = barkVolume;
        }
    }

    @JsonTypeName("kitty")
    public static class Cat extends Animal {
        public boolean licksButter;
        public int lives;

        public Cat(String name, boolean licksButter, int lives) {
            super(name);
            this.licksButter = licksButter;
            this.lives = lives;
        }
    }
}
