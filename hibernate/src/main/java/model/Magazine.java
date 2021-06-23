package model;

import lombok.Data;

import javax.persistence.Entity;
@Data
@Entity
public class Magazine extends MyBook {
    private String style;
    private int numberOfMagazine;
}
