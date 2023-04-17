package kg.internship.ships.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "classes")
public class Class {
    @Id
    @Column(length = 50, name = "class")
    String class_name;
    @Column(length = 2)
    String type;
    @Column(length = 20)
    String country;
    int numGuns;
    double bore;
    int displacement;

}
