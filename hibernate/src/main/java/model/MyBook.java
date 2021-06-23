package model;

import javax.persistence.*;

@Entity
@Table
public class MyBook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public MyBook() {

    }

    public void setId(int id) {
        this.id = id;
    }


    public int getId() {
        return id;
    }
    @Column
    private String name;
    @Column
    private String description;

    public MyBook(String name, String description) {
        this.name = name;
        this.description = description;
    }

    @Override
    public String toString() {
        return "MyBook{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
