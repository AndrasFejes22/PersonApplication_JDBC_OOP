package person;

import java.time.ZonedDateTime;

public class Person {

    private long id;

    private String name;

    private String number;

    private String slug;

    private ZonedDateTime created;


    public Person(long id, String name, String number, String slug, ZonedDateTime created) {
        super();
        this.id = id;
        this.name = name;
        this.number = number;
        this.slug = slug;
        this.created = created;
    }

    public Person() {

    }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }

    public String getSlug() {
        return slug;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }






    @Override
    public String toString() {
        return "Person [id=" + id + ", " + (name != null ? "name = " + name + ", " : "")
                + (number != null ? "number = " + number + ", " : "") + (created != null ? "created = " + created + ", " : "")
                + (slug != null ? "comment = " + slug : "") + "]";
    }
}
