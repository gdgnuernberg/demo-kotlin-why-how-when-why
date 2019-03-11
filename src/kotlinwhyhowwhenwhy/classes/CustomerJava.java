package kotlinwhyhowwhenwhy.classes;

import java.util.Objects;

public class CustomerJava {
    private final int id;
    private String name;
    private String email;

    public CustomerJava(int id) {
        this.id = id;
    }

    public CustomerJava(CustomerJava customerJava) {
        this.id = customerJava.id;
        this.name = customerJava.name;
        this.email = customerJava.email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CustomerJava that = (CustomerJava) o;
        return id == that.id &&
                name.equals(that.name) &&
                email.equals(that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
