package io.github.mattn.sbbatch.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Person holds first-name and last-name.
 *
 * @author mattn
 */
@Data
@Entity
@Table(name = "PERSON_INFO")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstName;

    private String lastName;
}
