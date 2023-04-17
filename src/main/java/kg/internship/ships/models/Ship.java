package kg.internship.ships.models;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "ships")
public class Ship {
    @Id
    @Column(length = 50)
    String name;
    @ManyToOne
    @JoinColumn(name = "class")
    Class class_name;
    int launched;
}
