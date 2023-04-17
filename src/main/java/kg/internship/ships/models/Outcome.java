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
@Table(name = "outcomes")
public class Outcome {
    @Id
    @Column(length = 50)
    String ship;
    @Id
    @ManyToOne(optional = false)
    @JoinColumn(name = "battle", nullable = false)
    Battle battle;
    @Column(length = 10)
    String result;

}
